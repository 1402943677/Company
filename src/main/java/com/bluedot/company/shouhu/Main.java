package com.bluedot.company.shouhu;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 20:36
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] s = line.split(" ");
        int[] arr = new int[s.length];

        for(int i=0;i<arr.length;i++){
            arr[i] = Integer.parseInt(s[i]);
        }
        int sum = arr[0] ;
        for(int i=1;i<arr.length;i++){
            sum = sum^arr[i];
        }
        for(int i=0;i<arr.length-1;i++){
            sum = sum^i;
        }
        System.out.println(sum);
    }
}
