package com.bluedot.company.toutiao3;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 10:54
 * @Description:
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        sort(arr);
        System.out.println(0);
    }
    static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j>0 && array[j]<array[j-1]){
                j--;
            }

        }
    }
}
