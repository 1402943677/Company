package com.bluedot.company.tenxun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/16 11:43
 * @Description:
 */
public class Main2 {
    static class ABC{
        int A;
        int B;
        int C;

        public ABC(int a, int b, int c) {
            A = a;
            B = b;
            C = c;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        List<ABC> arrayList = new ArrayList<>();
        for(int i=0;i<t;i++){
            arrayList.add(new ABC(scanner.nextInt(),scanner.nextInt(),scanner.nextInt()));
        }
        for(int i=0;i<arrayList.size();i++){
            int first = arrayList.get(i).A;
            int second = 0;
            int third = 0;
            if(arrayList.get(i).B% arrayList.get(i).A==0){
                second = arrayList.get(i).B;
            }
            if(arrayList.get(i).C% arrayList.get(i).A==0){
                third = arrayList.get(i).C;
            }
            if((first)%arrayList.get(i).B==arrayList.get(i).C){
                System.out.println("Yes");
                continue;
            }
            if((first+second)%arrayList.get(i).B==arrayList.get(i).C){
                System.out.println("Yes");
                continue;
            }

            if((first+third)%arrayList.get(i).B==arrayList.get(i).C){
                System.out.println("Yes");
                continue;
            }
            if((first+second+third)%arrayList.get(i).B==arrayList.get(i).C){
                System.out.println("Yes");
                continue;
            }
            System.out.println("No");
        }
    }
}
