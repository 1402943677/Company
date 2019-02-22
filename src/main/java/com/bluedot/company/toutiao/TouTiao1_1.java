package com.bluedot.company.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/20 20:27
 * @Description:1.1版本-通过率50%
 */
public class  TouTiao1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        String line = scanner.nextLine();
        String[] strs = line.split(" ");

        int[] strInt = new int[strs.length];
        for (int i=0;i<strs.length;i++){
            strInt[i] = Integer.parseInt(strs[i]);
        }

        line = scanner.nextLine();
        int q = Integer.valueOf(line);

        List<int[]> list = new ArrayList<>();
        for(int i=0;i<q;i++){
            int[] ints1 = new int[3];
            String[] strs1 = scanner.nextLine().split(" ");
            for (int j=0;j<strs1.length;j++){
                ints1[j] = Integer.parseInt(strs1[j]);
            }
            list.add(ints1);
        }

        for (int i=0;i<q;i++){
            int count =0;
            for (int j=list.get(i)[0]-1;j<list.get(i)[1];j++){
                if (strInt[j]==list.get(i)[2]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
