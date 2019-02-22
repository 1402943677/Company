package com.bluedot.company.tenxun;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/16 10:50
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();


        long m = n+1;
        while (true){
            long[] arrM = new long[(int)(m-n)];
            for(long i=n+1;i<=m;i++){
                arrM[(int)(i-n-1)] = i;

            }
            long[] arrN1 = new long[(int)m];
            for(int i=1;i<=m;i++){
                arrN1[i-1] = i;
            }
            int MaxN = getMaxPub(arrN1,m);

            int MaxM = getMaxPub(arrM,m);
            if(MaxN==MaxM){
                System.out.println(m);
                break;
            }
            m++;
        }


    }

    private static int getMaxPub(long[] arr, long max) {
        int result = 1;
        for(int i=2;i<=max;i++){
            boolean flag = false;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%i==0){
                    arr[j]=arr[j]/i;
                    flag=true;
                }
            }
            if(flag){
                result*=i;
                i--;
            }
        }
        return result;
    }
}
