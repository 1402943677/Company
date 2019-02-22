package com.bluedot.company.pdd;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/30 18:56
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long HP = scanner.nextInt();
        long normalAttack = scanner.nextInt();
        long buffedAttack = scanner.nextInt();

        long sum =0;
        if(2*normalAttack>buffedAttack){
           sum = HP/normalAttack;
           if(HP%normalAttack!=0){
               sum++;
           }
        }else {
           sum = HP/buffedAttack;
           long flag = sum%buffedAttack;
           if(flag!=0) {
               if (flag <= normalAttack) {
                   sum = sum * 2 + 1;
               } else {
                   sum = sum * 2 + 2;
               }
           }else {
               sum=sum*2;
           }
        }
        System.out.println(sum);
    }
}
