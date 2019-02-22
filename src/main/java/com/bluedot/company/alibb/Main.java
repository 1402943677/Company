package com.bluedot.company.alibb;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/7 19:47
 * @Description:
 */
public class Main {
    static class Point{
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] xy = line.split(",");
        Point myPoint = new Point(Integer.parseInt(xy[0]),Integer.parseInt(xy[1]));

        List <Point> arrayPoint = new ArrayList<>();
        line = scanner.nextLine();
        String[] point = line.split(",");
        for(int i=0;i<point.length;){
            arrayPoint.add(new Point(Integer.parseInt(point[i]),Integer.parseInt(point[i+1])));
            i=i+2;
        }
        double count = 0 ;
        for(int i=0;i<arrayPoint.size();i++){
            int x = arrayPoint.get(i).x;
            int y = arrayPoint.get(i).y;
            if(myPoint.x<=x && myPoint.y<=y){
                count++;
            }
        }
        if(count>=2){
            System.out.println("yes,0");
        }else {

        }




    }
}
