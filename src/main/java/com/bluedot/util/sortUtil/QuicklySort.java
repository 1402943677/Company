package com.bluedot.util.sortUtil;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/6/7 14:41
 * @Description: 快速排序(挖坑填数+分治)
 */
public class QuicklySort extends Sort {
    @Override
    public void sort(int[] array) {
        sort(array,0,array.length-1);
    }

    public void sort(int[] array,int low,int high){
        if(low>high){
            return;
        }
        int i = low ,j = high ,temp = array[i];
        while (i<j){

            while (i < j && array[j] >= temp) {
                j--;
            }
            if (i < j)
                array[i++] = array[j];// 用比基准小的记录替换低位记录
            while (i < j && array[i] < temp) {
                i++;
            }
            if (i < j) // 用比基准大的记录替换高位记录
                array[j--] = array[i];

        }
        array[i] = temp;
        sort(array, low, j - 1); // 对低子表进行递归排序
        sort(array, i + 1, high); // 对高子表进行递归排序

    }
}
