package com.bluedot.company.weipinghui;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 19:31
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int [] arrint = new int[n*n];
        int[][] arr = new int[n][n];
        int index =0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scanner.nextInt();
                arrint[index] = arr[i][j];
                index++;
            }
        }
        Arrays.sort(arrint);

        System.out.println(arrint[k-1]);


    }
}
