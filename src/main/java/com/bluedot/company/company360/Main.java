package com.bluedot.company.company360;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/27 18:49
 * @Description:
 */
public class Main {
    static class Point {
        long x,y;

        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public long getX() {
            return x;
        }

        public long getY() {
            return y;
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Point> points = new ArrayList<>();
        for(int i=0;i<n;i++){

            points.add(new Point(scanner.nextInt(),scanner.nextInt()));
        }
        Point pointMinX = points.stream().min(Comparator.comparing((x)->x.getX())).get();
        Point pointMinY = points.stream().min(Comparator.comparing((x)->x.getY())).get();

        Point pointMaxX = points.stream().max(Comparator.comparing((x)->x.getX())).get();
        Point pointMaxY = points.stream().max(Comparator.comparing((x)->x.getY())).get();

        long row = pointMaxX.getX()-pointMinX.getX();
        long clu = pointMaxY.getY()-pointMinY.getY();
        if(row>clu){
            System.out.println(row*row);
        }else {
            System.out.println(clu*clu);
        }

    }
}
