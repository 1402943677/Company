package com.bluedot.company.beike;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/3 20:22
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int n =  scanner.nextInt();
        Map<Integer,List<Integer>> map = new HashMap<>();
        int a,b;
        for(int i=0;i<n;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            if(map.get(b)==null) {
                List<Integer> list = new ArrayList<>();
                list.add(a);
                map.put(b,list);
            }else {
                map.get(b).add(a);
            }
        }

        int m = scanner.nextInt();
        Map<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<m;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            map1.put(a,b);
        }
        for(Integer key : map1.keySet()){

        }
    }
}
