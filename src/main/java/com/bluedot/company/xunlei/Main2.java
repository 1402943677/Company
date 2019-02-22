package com.bluedot.company.xunlei;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/12 20:02
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int sum =0;
        int index = 1;
        for(int i=1;i<=7;i++){
            sum=A+sum;
            if(sum>(-B)){
                index=i-1;
                break;
            }
        }
        int Anum = index;
        int Bnum = 7-index;

        int sumA = Anum*A*2;
        int sumB = Bnum*B*2;
        if(sumA>=3){
            sumA = sumA+3*A;
        }else {
            sumB = sumB+(3-Anum)*B;
            sumA = sumA+sumA*B;
        }
        System.out.println(sumA+sumB);
    }
}
