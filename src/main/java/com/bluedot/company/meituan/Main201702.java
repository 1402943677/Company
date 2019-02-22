package com.bluedot.company.meituan;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/5 20:36
 * @Description: 硬币问题
 */
public class Main201702{
    public static long count(int n){
        if(n <= 0){
            return 0;
        }
        int[] coins = new int[]{1,5,10,20,50,100};
        long[][] db = new long[6][n+1];
        for(int i=0;i<n+1;i++) {
            db[0][i]=1;
        }
        for(int i = 1; i < db.length; i++) {
            for(int j = 0; j < db[i].length; j++) {
                if(j-coins[i]>=0) {
                    db[i][j] =db[i-1][j] + db[i][j - coins[i]];
                }else {
                    db[i][j] =db[i-1][j];
                }
            }
        }
        return db[5][n];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            long res=count(n);
            System.out.println(res);
        }
    }
}