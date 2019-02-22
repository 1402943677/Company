package com.bluedot.company.pdd;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/30 19:15
 * @Description:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        char[][] strings = new char[N][N];
        scanner.nextLine();
        for(int i=0;i<N;i++){
            char [] line = scanner.nextLine().toCharArray();
            strings[i]=line;
        }

        for(int j=0;j<M;j++){
            int flag = 0;
            for (int i=N-1;i>=0; i--){
                if(strings[i][j]=='o'){
                    if(flag!=0){
                        strings[i][j]='.';
                        strings[--flag][j]='o';
                    }else {
                        strings[i][j]='.';
                    }
                }else if(strings[i][j]=='x'){
                    flag = i;
                }
            }
        }

        for (int i=0;i<N;i++){
            for (int j=0;j<M;j++){
                System.out.print(strings[i][j]);
            }
            System.out.print("\n");
        }
    }
}
