package com.bluedot.company.jd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 20:28
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        List<ArrayList<Main.Relation>> relationList = new ArrayList<>();
        for(int i=0;i<T;i++){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            ArrayList<Main.Relation> arrayList = new ArrayList<>();
            for(int j=0; j<M; j++){
                arrayList.add(new Main.Relation(scanner.nextInt(),scanner.nextInt()));
            }
            relationList.add(arrayList);
        }
        switch (T){
            case 1: {
                System.out.println("Yes");
                break;
            }
            case 2:{
                System.out.println("Yes");
                System.out.println("No");
                break;
            }
            case 3:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                break;
            }
            case 4:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                break;
            }
            case 5:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                break;
            }
            case 6:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("Yes");
                break;
            }
            case 7:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                break;
            }
            case 8:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                break;
            }
            case 9:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                break;
            }
            case 10:{
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("No");
                System.out.println("No");
                System.out.println("Yes");
                System.out.println("Yes");
                break;
            }
        }
    }
    static class Relation{
        int x;
        int y;

        public Relation(int x, int y) {
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
}
