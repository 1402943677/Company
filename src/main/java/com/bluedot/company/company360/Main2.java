package com.bluedot.company.company360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/27 20:45
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> A = new ArrayList<>();
        for(int i=0;i<n;i++){
            A.add(scanner.nextInt());
        }
        List<Integer> B = new ArrayList<>();
        for(int i=0;i<n;i++){
            B.add(scanner.nextInt());
        }
        int count =0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int m =A.get(i);
                int o =A.get(j);
                int indexm = -1;
                int indexo = -1;
                for (int r=0;r<n;r++){
                    if(B.get(r).equals(m)){
                        indexm = r;
                    }
                    if(B.get(r).equals(o)){
                        indexo = o;
                    }
                }
                if(indexm>indexo){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
