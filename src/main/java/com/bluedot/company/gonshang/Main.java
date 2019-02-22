package com.bluedot.company.gonshang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/16 19:19
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String line1 = scanner.nextLine();
        String[] arr = line.split(" ");
        String[] arr1 = line1.split(" ");
        Arrays.sort(arr);
        Arrays.sort(arr1);
        List<Integer> arrList = new ArrayList<>();
        List<Integer> arr1List = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arrList.add(Integer.valueOf(arr[i]));
        }
        for(int i=0;i<arr1.length;i++){
            arr1List.add(Integer.valueOf(arr1[i]));
        }
        int count =0 ;
        for(int i=arr1List.size()-1;i>=0;i--){
            for (int j=arrList.size()-1;j>=0;j--){
                if(arr1List.get(i)>=arrList.get(j)){
                    count++;
                    arr1List.remove(i);
                    arrList.remove(j);
                    break;
                }else {
                    arrList.remove(j);
                }
            }
        }
        System.out.println(count);
    }
}
