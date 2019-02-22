package com.bluedot.company.weipinghui;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 19:38
 * @Description:
 */
public class Main3 {
    public static String Binary(String str1 , String str2) {
        String result = "";
        int i = str1.length() - 1;
        int j = str2.length() - 1;
        int sum = 0;
        while (i >= 0 || j >= 0 || sum > 0){
            if(i >= 0) {
                sum +=  str1.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += str2.charAt(j) - '0';
                j--;
            }

            result = (char)(sum % 2 + '0')  + result;
            sum /= 2;
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        String a = line.substring(0, line.indexOf(" "));

        String b = line.substring(line.indexOf(" ") + 1);
        System.out.print(Binary(a, b));
    }

}
