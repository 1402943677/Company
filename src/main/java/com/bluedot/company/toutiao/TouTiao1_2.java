package com.bluedot.company.toutiao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/8/20 22:04
 * @Description:
 */
public class TouTiao1_2 {
    public static  class objec{
        int value;
        int index;

        public objec(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.valueOf(scanner.nextLine());
        String line = scanner.nextLine();
        String[] strs = line.split(" ");


        List<objec> listStr = new ArrayList<>();
        for (int i=0;i<strs.length;i++){
            listStr.add(new objec(Integer.parseInt(strs[i]),i));
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

        Map<Integer,List<objec>> map = listStr.stream().collect(Collectors.groupingBy(objec::getValue));
        for(int i=0;i<q;i++){
            int l = list.get(i)[0];
            int r = list.get(i)[1];
            int k = list.get(i)[2];
            long count = 0;
            if(map.get(k)!=null) {
                count = map.get(k).stream().filter(u -> u.getIndex() <= r - 1).filter(u -> u.getIndex() >= l - 1).count();
            }
            System.out.println(count);
        }



    }
}
