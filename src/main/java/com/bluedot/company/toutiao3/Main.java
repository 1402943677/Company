package com.bluedot.company.toutiao3;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 09:57
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        int k = 0;
        int index = 0;
        int result  = 0;
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        int[] arr = new int[26];
        char[] falg = line.toCharArray();

        for (int i = 0; i < line.length(); i++) {
            int x = falg[i] - 96;
            if(arr[x % 26] != 1){
                arr[x % 26] = 1;
                k++;
            }else{
                arr = new int[26];
                if(result < k){
                    result = k;
                }
                k = 0;
                index ++;
                i = index;
            }
        }
        if(result < k){
            result = k;
        }
        System.out.println(result);
    }
}
