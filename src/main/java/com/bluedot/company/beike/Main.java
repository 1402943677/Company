package com.bluedot.company.beike;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/3 19:31
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long N = scanner.nextInt();
        long M = scanner.nextInt();

        if(M<=N){
            System.out.println(N-M);
        }

        long count = 0;
        List<Long> arr = new ArrayList<>();
        int n =2;
        long N1 = N;
        for (int j=1;;j++){

            long b = N1/2;
            if(b!=0) {
                arr.add(b);
                if(N1%2!=0){
                    N1 = b+1;
                }else {
                    N1 =b;
                }
            }else {
                break;
            }
        }

        int c = 0;
        for (int j=0;j<arr.size();j++){

            if(N>=arr.get(j)){
                c=j;
                break;
            }else if(j==arr.size()-1) {
                c = j;
            }
        }

        count = N - arr.get(c);

        count = count+ arr.get(c)*(long)Math.pow(2,arr.size()-c+1)-M;

        System.out.println(count);



    }
}
