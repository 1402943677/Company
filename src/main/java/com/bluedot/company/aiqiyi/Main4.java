package com.bluedot.company.aiqiyi;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/15 11:42
 * @Description:
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=0, M=0, P=0;
        int indexflag = 0;
        String line = scanner.nextLine();

        for (int i = 0; i < 3; i++) {
            int index = line.indexOf(" ", indexflag);
            if (i == 0) {
                N = Integer.parseInt(line.substring(indexflag, index));
            }
            else if(i == 1){

                M = Integer.parseInt(line.substring(indexflag, index));
            }
            else{
                P = Integer.parseInt(line.substring(indexflag));
            }
            indexflag = index + 1;
        }

        int[] foods = new int[N];
        line = scanner.nextLine();
        indexflag = 0;
        String flag;

        for (int i = 0; i < N; i++) {
            int index = line.indexOf(" ", indexflag);
            if(index != -1){
                foods[i] = Integer.parseInt(line.substring(indexflag, index));
            }
            else
            {
                foods[i] = Integer.parseInt(line.substring(indexflag));
            }
            indexflag = index + 1;
        }

        for (int i = 0; i < M; i++) {
            flag = scanner.nextLine();
            if(flag.substring(0,1).equals("A")){
                foods[Integer.parseInt(flag.substring(2)) - 1]++;
            }
            else {
                foods[Integer.parseInt(flag.substring(2)) - 1]--;
            }
        }
        int count = 1;
        int length = foods[ P -1];
        for (int i = 0; i < N; i++) {
            for (int j = 1; j < N - i; j++) {
                int swap;
                if(foods[j -1] > foods[j]){
                    swap = foods[j - 1];
                    foods[j - 1] = foods[j];
                    foods[j] = swap;
                }
            }

            if(foods[N - i - 1] == length){
                System.out.println(count);
                return;
            }
            else{
                count++;
            }
        }
    }
}
