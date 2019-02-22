package com.bluedot.company.jd;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/9 20:00
 * @Description:
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();

        int[][] arr = new int[n][4];
        for (int j=0; j<n; j++) {
            arr[j][0] = 1;
            arr[j][1] = scanner.nextInt();
            arr[j][2] = scanner.nextInt();
            arr[j][3] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(arr[j][0] != 0){
                    if(arr[i][1] < arr[j][1] && arr[i][2] < arr[j][2] && arr[i][3] < arr[j][3]){
                        ++result;
                        arr[i][0] = 0;
                        break;
                    }
                }
            }
        }
        System.out.println(result);
    }
}

