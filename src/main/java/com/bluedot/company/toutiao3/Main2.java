package com.bluedot.company.toutiao3;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 10:15
 * @Description:
 */
public class Main2 {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M = scanner.nextInt();
        int [][] arr = new int[M][M];
        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        int sum=0;
        boolean [][] arrFlag = new boolean[M][M];

        for(int i=0;i<M;i++){
            for(int j=0;j<M;j++) {
                if (arr[i][j] == 1) {
                    stackPrint(arr, i, j, arrFlag, M);
                    if(count!=0){
                        ++sum;
                    }
                    count=0;
                }
            }
        }

        System.out.println(sum);
    }

    static void stackPrint(int[][] arr,int i,int j,boolean[][] arrFlag,int M){

        if (arr[i][j] == 1 && arrFlag[i][j] == false) {
            ++count;
            arrFlag[i][j] = true;
            if(j<M-1) {
                if (arr[i][j + 1] == 1 && arrFlag[i][j+1] == false) {
                    stackPrint(arr, i, j + 1, arrFlag, M);
                }
            }
            if(i<M-1) {
                if (arr[i + 1][j] == 1 && arrFlag[i+1][j] == false) {
                    stackPrint(arr, i + 1, j, arrFlag, M);
                }
            }
        } else {
            return;
        }

    }
}
