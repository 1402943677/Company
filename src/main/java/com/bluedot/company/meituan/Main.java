package com.bluedot.company.meituan;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/6 20:12
 * @Description:
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int t = scanner.nextInt();
        List<Integer> integerList = new ArrayList<>();
        for(int i=0;i<n;i++){
            integerList.add(scanner.nextInt());
        }

        Map<Integer,Integer> map = new HashMap<>();
        int flag=0;
        int count =0;
        for(int i=0;i<n-k+1;i++){
            for(int j=i;j<=i+k-1;j++){
                flag = integerList.get(j);
                if(map.get(flag)==null){
                    map.put(flag,1);
                }else {
                    int w =map.get(flag)+1;
                    if(w>=t) {
                        ++count;
                        break;
                    }else {
                        map.put(flag,w );
                    }
                }

            }

            map.clear();
        }


        System.out.println(count);

    }
}
