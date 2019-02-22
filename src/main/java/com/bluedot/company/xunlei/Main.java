package com.bluedot.company.xunlei;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/12 19:47
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;

        for(int i=1;i<N-2;i++){
            for (int j=i+1;j<N-1;j++){
                for (int k=j+1;k<N; k ++){
                    if(i*i+j*j == k*k){

                        if(maxGonYue3(i,j,k)==1){
                            count++;
                        }

                    }
                }
            }
        }
        System.out.println(count);
    }
    public static int maxGonYue3(int a, int b, int c) {
        int d = maxGonYue2(a, b);
        int i = c % d;
        int yue = 1;
        if (i == 0) {
            yue = d;
            // System.out.println(yue);
        } else {
            c = maxGonYue2(a, b);
            d = i;
            yue = maxGonYue2(c, d);
        }
        return yue;
    }
    public static int maxGonYue2(int a, int b) {
        int i = a % b;
        int yue = 1;
        if (i == 0) {
            yue = b;
            //System.out.println(yue);
        } else {
            a = b;
            b = i;
            yue = maxGonYue2(a, b);
        }
        return yue;

    }
}
