package com.bluedot.util.sortUtil;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/6/7 11:11
 * @Description:
 */
public abstract class Sort {
     public abstract void sort(int[] array);
     public void swap (int[] array,int i, int j){
         int tmp = array[i];
         array[i] = array[j];
         array[j] = tmp;
     }

     public void swapByXOR(int[] array,int i, int j){
         array[i] = array[i]^array[j];
         array[j] = array[i]^array[j];
         array[i] = array[i]^array[j];
     }
}
