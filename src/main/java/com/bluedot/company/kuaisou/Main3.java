package com.bluedot.company.kuaisou;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/10 19:53
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] costString = line.split(",");
        int[] costInt = new int[costString.length];
        for(int i=0;i<costInt.length;i++){
            costInt[i] = Integer.parseInt(costString[i]);
        }
        for(int i=0;i<costInt.length;i++){
            if(costInt[i]==100){
                costInt[i]=0;
            }
        }
        int sum = 0 ;
        for(int i=0;i<costInt.length;i++){
            sum=costInt[i];
        }
        System.out.println(sum);
    }
}
