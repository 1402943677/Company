package com.bluedot.util.sortUtil;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/6/7 11:35
 * @Description: 简单选择排序
 */
public class SelectSort extends Sort {
    @Override
    public void sort(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    swap(array,i,j);
                }
            }
        }
    }
}
