package com.bluedot.company.Netease;

import com.bluedot.util.MemoryUtil;
import com.bluedot.util.TimeUtil;

import java.util.Scanner;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/7/19 23:07
 * @Description: 字符串碎片---网易大题1
 * 解析：
 *      1、碎片平均长度=字符串长度/碎片个数
 *      2、求碎片个数：循环遍历字符串str[i]!=str[i+1]表示产生一个碎片
 */
public class StringFragment1 {

    public static void main(String[] args) {
        //计算时间
        long time1 = TimeUtil.getNowThreadUsedTime();
        //计算堆内存
        long heapMemory = MemoryUtil.getNowHeapMemory();
        //计算非堆内存
        long no_heapMemory = MemoryUtil.getNowNo_HeapMemory();

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char[] chars = str.toCharArray();
        //碎片总数
        int sum = 1;
        char falg = chars[0];
        for(char c : chars){
            if(falg!=c){
                sum++;
            }
        }
        System.out.println(sum);
        //字符串长度除于碎片个数
        double dou = (double) chars.length/sum;
        //格式输出
        System.out.println(String.format("%.2f",dou));

        System.out.println(TimeUtil.getNowThreadUsedTime()-time1);
        System.out.println(MemoryUtil.getNowHeapMemory()-heapMemory);
        System.out.println(MemoryUtil.getNowNo_HeapMemory()-no_heapMemory);
    }
}
