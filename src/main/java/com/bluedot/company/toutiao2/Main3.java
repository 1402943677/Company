package com.bluedot.company.toutiao2;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/25 11:21
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        List<Integer> list1 = new ArrayList<>();
        Optional<Integer> integer = list.stream().min((x, y)->{
            return x>y?y:x;
        });
        int min = integer.get();
        list1.add(min);

        for(int i=0;i<t;i++){
            List<Integer> copyList = new ArrayList<>();
            for(int j=0;j<list.size();j++){
                copyList.add(list.get(j));
            }

            for(int j=0;j<list1.size();j++){
                copyList.remove(list1.get(j));
            }
            for(int j=0;j<copyList.size();j++){
                Optional<Integer> integer1 = copyList.stream().min((x, y)->{
                    return x>y?y:x;
                });
                int min1 = integer.get();
                if(list1.get(list1.size()-1)<=min1){
                    list1.add(min1);
                }
                for(int k=0;k<copyList.size();k++){
                    if(copyList.get(k)!=min1){
                        copyList.remove(k);
                    }else {
                        copyList.remove(k);
                        break;
                    }
                }
            }
        }
        System.out.println(list1.size());
    }
}
