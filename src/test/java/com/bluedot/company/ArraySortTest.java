package com.bluedot.company;

import org.junit.Test;

import java.util.Arrays;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/3 23:11
 * @Description: 排序
 */
public class ArraySortTest {
    @Test
    public void testArraySort(){
        int [] arr = new int[]{1,8,1,3,4,2,9,42,12,34};

        /**
         * 使用工具类Arrays.sort()方法排序
         * 底层使用了快排排序+优化的归并排序
         */
        Arrays.sort(arr);
        for (int ar: arr) {
            System.out.print(ar+"  ");
        }
    }
}
