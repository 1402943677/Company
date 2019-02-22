package com.bluedot.company.meituan;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/6 21:18
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] arr = new int[2][n];
        for(int i=0;i<n;i++){
            arr[0][i] = scanner.nextInt();
            arr[1][i] = scanner.nextInt();
        }
        System.out.println(n);
    }
}
