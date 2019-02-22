package com.bluedot.company.company360;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/27 20:09
 * @Description:
 */
public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<Integer> points = new ArrayList<>();
        for(int i=0;i<n;i++){
            points.add(scanner.nextInt());
        }

        long q = scanner.nextLong();
        List<Point> pointList = new ArrayList<>();
        for(long i=0;i<q;i++){
            pointList.add(new Main1.Point(scanner.nextInt(),scanner.nextInt()));
        }

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<q;i++){
            long l = pointList.get(i).getX()-1;
            long r = pointList.get(i).getY();
            for(int j=(int)l;j<r;j++){
                set.add(points.get(j));
            }
            System.out.println(set.size());
            set.clear();
        }
    }
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
}
