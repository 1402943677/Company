package com.bluedot.util.sortUtil;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/6/7 12:57
 * @Description: 直接插入排序
 */
public class InsertSort extends Sort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            while (j>0 && array[j]<array[j-1]){
                swap(array,j,j-1);
                j--;
            }

        }
    }
}
