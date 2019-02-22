package com.bluedot.company.toutiao3;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 10:57
 * @Description:
 */
public class Main5 {
    static int sum =0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] arr = new int[N][M];
        for(int i=0; i<M;i++){
            arr[0][i]=scanner.nextInt();
            arr[1][i]=scanner.nextInt();
        }
        prp(N);
        System.out.println(1);
    }

    static void prp(int i){

        for (int j=i;j<=i;j++){
            sum++;
        }
    }

}
