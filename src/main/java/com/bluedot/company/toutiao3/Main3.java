package com.bluedot.company.toutiao3;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 10:40
 * @Description:
 */
public class Main3 {
    static  int sum;
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        String ip = scanner.nextLine();

        char[] ipLine = ip.toCharArray();

        stackIp(ipLine,0,0);
        System.out.println(sum);
    }

    static void stackIp(char[] ipLine,int index,int flag){
        if (flag==4&&index!=ipLine.length){
            return;
        }else if(index==ipLine.length&&flag!=4){
            return;
        }else if(flag==4&&index==ipLine.length){
            ++sum;
            return;
        }
        String ipFlag = "";
        for(int i = index;i<ipLine.length;i++){
            ipFlag+=ipLine[i];
            if(Integer.parseInt(ipFlag) <= 255){
                stackIp(ipLine,i+1,flag+1);

            }else {
                return;
            }

        }
    }
}
