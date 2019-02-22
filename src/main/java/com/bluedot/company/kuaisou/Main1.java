package com.bluedot.company.kuaisou;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/10 20:23
 * @Description:
 */
public class Main1 {
    static class Line{
        int l ;
        int r;
        int sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] arr = new int[N];

        int[] sum = new int[N];

        for(int i=0;i<N;i++){
            arr[i] = scanner.nextInt();
        }
        int Max =0;
        sum[0] = arr[0];

        ArrayList<Integer> arrayList = new ArrayList<>();
        int index=0;
        int Min = 0;
        for(int i=1;i<N;i++){
            sum[i] = arr[i]+sum[i-1];
            if(Min>sum[i]){
                index = i;
                Min = sum[i];
            }
        }
        int result =0;
        int index1 = 0;
        for(int i=0;i<=index;i++){
            if(arr[i]>0){
                index1 = i;
                break;
            }
        }
        for(int i=index1;i<=index;i++){
            result= arr[i]+result;
        }

       /* for(int i=1;i<N;i++){
            sum[i] = arr[i]+sum[i-1];
            if(Max<sum[i]){
                Max = sum[i];
            }
        }
        */
        System.out.println(Max);

    }
}
