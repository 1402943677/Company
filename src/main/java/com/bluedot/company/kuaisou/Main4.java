package com.bluedot.company.kuaisou;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/10 20:51
 * @Description:
 */
public class Main4 {
    public static void main(String[] args) {
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a % b == 0){
            System.out.println(a / b);
            return;
        }
        double a1 = 1.0 * a / b ;
        String str = new String("" + a1);
        char[] chars = str.toCharArray();

        String substring = str.substring(str.indexOf(".")+1, str.indexOf(".") + 3);

        for (int i = 0; i < chars.length; i++) {
            if(!flag1 && chars[i] == '.'){
                flag1 = true;
                i = i + 2;
            }else if(flag1){
                char[] ch_circle = substring.toCharArray();
                for (int i1 = 0; i1 < substring.length(); i1++) {
                    if(ch_circle[i1] == chars[i+i1]){
                        flag3 = true;
                    }else{
                        flag3 = false;
                        substring +=  ""+  chars[i];
                        break;
                    }
                }
                if(flag3 ){
                    flag2 = true;
                    break;
                }
            }
        }

        if(flag2){
            if(substring.length() == 2){
                if(substring.substring(1) .equals(substring.substring(0,1))) {
                    System.out.println(str.substring(0, str.indexOf(".")) + ".(" + substring.substring(1) + ")");
                }else{
                    System.out.println(str.substring(0, str.indexOf(".")) + "."+ substring+"");
                }
            }
            else{
                System.out.println(str.substring(0, str.indexOf(".")) + ".("+ substring+")");
            }
        }else{
            if(chars[3] == chars[4]){
                System.out.println(str.substring(0, str.indexOf(".")) + "." +substring.substring(0,1)+ "(" + substring.substring(1,2) + ")");
                return;
            }
            System.out.println(str);
        }
    }
}
