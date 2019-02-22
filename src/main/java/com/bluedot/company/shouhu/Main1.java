package com.bluedot.company.shouhu;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 20:46
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        int[] arr = new int[1024];
        int flag ;
        Scanner scanner = new Scanner(System.in);

        while(true){
            flag = scanner.nextInt();
            if(arr[flag % 1024] == 0){
                arr[flag % 1024] = 1;
            }else{
                System.out.println(flag);
                return;
            }
        }
    }
}
