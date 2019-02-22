package com.bluedot.company.pdd;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/30 19:40
 * @Description:
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int yu = N%M;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(yu,0);
        int x=0;
        int y=0;
        boolean flag=true;
        while (flag){
            while (yu<M){
                yu=yu*10;
                x++;
            }
            yu=yu%M;

            if(map.get(yu)!=null){
                if(yu==0){
                    break;
                }
                y = x-map.get(yu);
                x = map.get(yu);
                break;
            }else {
                map.put(yu,x);
            }
        }
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);

    }
}
