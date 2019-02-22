package com.bluedot.company.aiqiyi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 10:36
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        char[] arrChar = line.toCharArray();
        int[] arrInt = new int[arrChar.length];

        for(int i=0;i<arrChar.length;i++){
            arrInt[i] = arrChar[i]-'0';
        }

        int begin = 0;
        int end = 0;
        int count = 0;

        for(int i=0;i<arrInt.length/2;i++){
            begin+=arrInt[i];
        }

        for(int i=(arrInt.length/2);i<arrInt.length;i++){
            end+=arrInt[i];
        }

        int min =0;
        int beginIndex;
        int endIndex;
        if(begin<end){
            min = begin;
            beginIndex = 0;
            endIndex = 2;
        }else {
            min = end;
            beginIndex = 3;
            endIndex = 5;
        }
        int [] arrflag = new int[3];
        int flag =0;
        for(int i=beginIndex;i<=endIndex;i++){
            arrflag[flag] = arrInt[i];
            flag++;
        }
        Arrays.sort(arrflag);

        if(begin-end==0){
            count = 0 ;
        }else if(Math.abs(begin-end)<=9){
            if(arrflag[1]+arrflag[2]+9>=min){
                count = 1;
            }else if (arrflag[2]+18>=min){
                count = 2;
            }else {
                count = 3;
            }
        }else if (Math.abs(begin-end)<=18){
            if (arrflag[2]+18>=min){
                count = 2;
            }else {
                count = 3;
            }
        }else {
            count =3;
        }
        System.out.println(count);
    }
}
