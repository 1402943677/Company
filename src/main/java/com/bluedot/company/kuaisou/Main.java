package com.bluedot.company.kuaisou;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/10 19:53
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();
        String [] costString = line.split(",");
        int[] costInt = new int[costString.length];
        for(int i=0;i<costInt.length;i++){
            costInt[i] = Integer.parseInt(costString[i]);
        }
        int sum=0;
        if(costInt.length>=1) {
            int i = costInt.length - 1;
            while (true) {
                if (i == 0 || i == 1) {
                    sum = sum + costInt[i];
                    break;
                }
                if (costInt[i - 1] < costInt[i - 2]) {
                    sum = sum + costInt[i];
                    i = i - 1;
                } else {
                    sum = sum + costInt[i];
                    i = i - 2;

                }
            }
        }else if (costInt.length==1){
            sum = costInt[0];
        }
        System.out.println(sum);
    }
}
