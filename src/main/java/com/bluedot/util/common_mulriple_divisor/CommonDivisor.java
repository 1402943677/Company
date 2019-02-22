package com.bluedot.util.common_mulriple_divisor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/17 16:23
 * @Description: 求集合内所有元素的最大公约数【即因子】------欧几里德算法【辗转相除法】
 */
public class CommonDivisor {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(60);
        arr.add(160);
        arr.add(64);
        arr.add(80);
        int max = getCommonDivisor(arr);
        System.out.println(max);
        System.out.println(getTowDivisor(12,60));
    }

    /**
     * 求集合内所有元素的最大公约数【即因子】------欧几里德算法【辗转相除法】
     * 变量使用欧几里德算法算出两个数的最大公约数，继而求出所有数的公约数
     * @param arr 原集合
     * @return
     */
    public static int getCommonDivisor(List<Integer> arr){
        int temp = -1;
        if (arr!=null&&arr.size()!=0) {
            temp = arr.get(0);
            for (int i=0;i<arr.size()-1;i++){
                int x = temp;
                int y = arr.get(i+1);
                temp = getTowDivisor(x,y);
            }
        }
        return temp;
    }

    /**
     * 欧几里德算法【辗转相除法】，求两个数的最大公约数
     * 第一步：用较大的数x除以较小的数y得到一个商q0和一个余数r0；（x=y*q0+r0）
     * 第二步：若r0=0，则y为x，y的最大公约数；
     *         若r0!=0，则用除数y除以余数r0得到一个商q1和一个余数r1；（y=r0*q1+r1）
     * 第三步：若r1=0，则r0为x，y的最大公约数；
     *         若r1!=0，则用除数r0除以余数r1得到一个商q2和一个余数r2；（r0=r1*q2+r2）
     *
     * @param x
     * @param y
     * @return
     */
    public static int getTowDivisor(int x,int y){
        return y==0?x:getTowDivisor(y,x%y);
    }

}
