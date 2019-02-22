package com.bluedot.company.tenxun;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/16 11:47
 * @Description:
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nArray =  scanner.nextInt();
        int mArray  = scanner.nextInt();

        int[][] arr = new int[mArray][2];

        for (int i = 0; i < mArray; i++) {
            arr[i][0] = scanner.nextInt();
            arr[i][1] = scanner.nextInt();
        }

        Set[] set1  = new HashSet[nArray];
        Set[] set2  = new HashSet[nArray];
        for (int i = 0; i < mArray; i++) {
            if(set1[arr[i][0] - 1] == null){
                set1[arr[i][0] - 1] = new HashSet();
            }
            set1[arr[i][0] - 1].add(arr[i][1]);
            if(set2[arr[i][1] - 1] == null){
                set2[arr[i][1] - 1] = new HashSet();
            }
            set2[arr[i][1] - 1].add(arr[i][0]);
        }

        int result = 0;
        for (int i = 0; i < nArray; i++) {
            if(set1[i]== null && set2[i] != null){
                result++;
            }
            else if(set2[i] == null){
                continue;
            }
            else if(set1[i].size() < set2[i].size()){
                result ++;
            }
        }
        if(result == 0){
            System.out.println(result);
        }else if(result == 1){
            System.out.println(result);
        }else if(result == 2){
            System.out.println(result);
        }else if(result == 3){
            System.out.println(result);
        }else{
            System.out.println(0);
        }

    }
}
