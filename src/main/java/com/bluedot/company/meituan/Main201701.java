package com.bluedot.company.meituan;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/5 20:36
 * @Description:
 */
public class Main201701 {
    static int count =0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
        System.out.println(count);
    }
    static void print(int n){
        if(n==0){
          ++count;
          return;
        }
        for(int i=1;i<=6;i++){
            if (n - i >= 0) {
                print(n-i);
            }
        }
    }
}
