package com.bluedot.company.pdd;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/30 20:36
 * @Description:
 */
import java.util.Random;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/30 20:05
 * @Description:
 */
public class Main4 {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();
        scanner.nextLine();
        char[][] arr = new char[N][L];
        for (int i=0;i<N;i++) {
            arr[i] = scanner.nextLine().toCharArray();
        }
        StringBuilder stringBuilder = new StringBuilder();

        int k =0;
        for (int i=0;i<L;i++) {
            stringBuilder.append(arr[k][i]);
            if(k<N-1){
                k=random.nextInt(L-1);;
            }
        }
        System.out.println(stringBuilder.toString());
    }


}