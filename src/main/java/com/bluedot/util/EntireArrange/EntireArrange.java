package com.bluedot.util.EntireArrange;

/**
 * @Author: WFP
 * @Time: 2018/3/31
 * @decription: 全排列算法
 */
public class EntireArrange {
    public static void main(String[] args) {
        int[] arry = {1,8,1};
        sort(arry,0);
    }

    /**
     * 判断是否相同
     * @param data
     * @param begin
     * @param end
     * @return
     */
    private static boolean isUnique(int[] data, int begin, int end){
        for(int i = begin; i < end; i++)
            if(data[i] == data[end])
                return false;
        return true;
    }


    /**
     * 全排列算法
     * @param arry 数组
     * @param i 从第i位开始交换
     */
    public static void sort(int[] arry ,int i){
        if(i==arry.length){
            for (int j=0;j<arry.length;j++) {
                System.out.print(arry[j]+"  ");
            }
            System.out.println("");
        }
        for (int j = i;j<arry.length;j++){
            if(isUnique(arry, i, j)){
                swap(arry, i, j);

                sort(arry, i + 1);

                swap(arry, i, j);
            }

        }
    }

    /**
     * 交换两个值
     * @param arry
     * @param i
     * @param j
     */
    public static void swap(int[] arry, int i,int j){
        int k ;
        k = arry[i];
        arry[i] = arry[j];
        arry[j] = k;
    }
}