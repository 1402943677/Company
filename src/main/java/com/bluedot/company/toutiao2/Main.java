package com.bluedot.company.toutiao2;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/25 10:08
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,Set<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            Set<Integer> list = new HashSet<>();
            while (true){
                int k = sc.nextInt();
                list.add(k);
                if(k==0){
                    break;
                }
            }
            map.put(i+1,list);
        }

        Map<Integer,Set<Integer>> map1 = new HashMap<>();
        int count =0;

        for(int i=1;i<=n;i++){
            for(int j=0;j<map.get(i).size();j++){

                boolean boo = true;
                int mm=0;
                for(Integer integer : map1.keySet()){
                    Iterator it = map1.get(integer).iterator();
                    while(it.hasNext()){
                        if((Integer)it.next()==i){
                            boo = false;
                            Iterator it1 = map.get(i).iterator();
                            while(it1.hasNext()){
                                map1.get(integer).add((Integer) it1.next());
                            }
                        }
                    }
                }
                if(boo==true){
                    Set<Integer> list1 = new HashSet<>();
                    list1.add(i);
                    map1.put(count,list1);

                    mm = count;
                    count++;
                }

                int flag = map.get(i).size();
                boo = true;
                for(Integer integer : map1.keySet()){
                    Iterator it = map1.get(integer).iterator();
                    while(it.hasNext()){
                        if((Integer)it.next()==flag){
                            boo = false;
                        }
                    }
                }
                if(boo==true){
                    Set<Integer> list1 = new HashSet<>();
                    list1.add(i);
                    if(mm!=0) {
                        map1.put(mm, list1);
                    }else {
                        map1.put(count,list1);
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
