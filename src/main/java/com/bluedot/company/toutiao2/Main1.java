package com.bluedot.company.toutiao2;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/25 10:53
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<>();
            while (true){
                int k = sc.nextInt();
                list.add(k);
                if(k==0){
                    break;
                }
            }
            map.put(i,list);
        }

        Integer [][] arr = new Integer[n][n];

        for(int i=0;i<=n;i++){
            for(int j=0;j<map.get(i).size();j++){
                arr[i][ map.get(i).get(j)] =1;
            }
        }

        ArrayList<Set<Integer>> arrayList = new ArrayList<>();

        for(int i=0;i<=n;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=0;j<=n;j++){
                if(arr[i][j]==1){
                    set.add(j);
                }
            }

        }

    }
}
