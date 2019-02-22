package com.bluedot.company.aiqiyi;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 11:24
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int P = scanner.nextInt();
        int[] foodArr = new int[N];
        for (int i=0;i<N;i++){
            foodArr[i] = scanner.nextInt();
        }

        scanner.nextLine();

        for(int i=0;i<M;i++){
            String line = scanner.nextLine();
            char[] arrChar = line.toCharArray();
            if(arrChar[0]=='A'){
                foodArr[arrChar[1]]=foodArr[arrChar[1]]-1;
            }else {
                foodArr[arrChar[1]]=foodArr[arrChar[1]]+1;
            }
        }

        List<XY> arrryList = new ArrayList<>();
        for (int i=0;i<N;i++){
            if(foodArr[i]!=0){
                arrryList.add(new XY(i,foodArr[i]));
            }
        }
        arrryList.sort((x,y)->x.getY()-y.getY());

        int count = 1;

        for(int i=0;i<arrryList.size();i++){
            if(i==0){

            }
            if (arrryList.get(i).getY()==arrryList.get(i-1).getY()){

            }else {

            }

        }
    }
    static  class XY{
        int X;
        int Y;

        public int getX() {
            return X;
        }

        public void setX(int x) {
            X = x;
        }

        public int getY() {
            return Y;
        }

        public void setY(int y) {
            Y = y;
        }

        public XY(int x, int y) {
            X = x;
            Y = y;
        }
    }
}
