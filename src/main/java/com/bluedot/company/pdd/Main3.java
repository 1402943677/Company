package com.bluedot.company.pdd;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/30 20:05
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine();
        char[][] arr = new char[N][L];
        for (int i=0;i<N;i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }
        String stringBuilder = new String();


        getarr(arr,0,L,stringBuilder);
    }

    static void getarr(char[][] arr,int begin,int end,String stringBuilder){

        if(begin==end){
            System.out.println(stringBuilder);

            return;
        }
        for(int n=0;n<arr.length;n++) {
            stringBuilder=stringBuilder+arr[n][begin];
            getarr(arr,begin+1,end,stringBuilder);
            stringBuilder.substring(0,begin);
        }
    }
}
