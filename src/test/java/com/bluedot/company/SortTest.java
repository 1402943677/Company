package com.bluedot.company;

import com.bluedot.util.sortUtil.*;
import org.junit.Test;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/6/7 11:24
 * @Description: 排序算法测试
 */
public class SortTest {
    int [] array = {2,0,6,7,7,9,4};
    Sort sort;

    /**
     * 冒泡排序测试
     */
    @Test
    public void bubbleSortTest(){
        sort = new BubbleSort();
        sort.sort(array);
        Arrays.stream(array).forEach((x)-> System.out.print(x+ "  "));
    }
    /**
     * 选择排序
     */
    @Test
    public void selectSortTest(){
        sort = new SelectSort();
        sort.sort(array);
        Arrays.stream(array).forEach((x)-> System.out.print(x+ "  "));
    }

    /**
     * 简单插入排序
     */
    @Test
    public void insertSortTest(){
        sort = new InsertSort();
        sort.sort(array);
        Arrays.stream(array).forEach((x)-> System.out.print(x+ "  "));
    }

    /**
     * 堆排序
     */
    @Test
    public void heapSortTest(){
        sort = new HeapSort();
        sort.sort(array);
        Arrays.stream(array).forEach((x)-> System.out.print(x+ "  "));
    }

    /**
     * 快速排序
     */
    @Test
    public void quicklySortTest(){
        sort = new QuicklySort();
        sort.sort(array);
        Arrays.stream(array).forEach((x)-> System.out.print(x+ "  "));
    }

    /**
     * 归并排序
     */
    @Test
    public void MergeSortTest(){
        sort = new MergeSort();
        sort.sort(array);
        Arrays.stream(array).forEach((x)-> System.out.print(x+ "  "));
    }

    /**
     * 查找数组中第K小或第K大
     */
    @Test
    public void BFPRTTest(){
/*        int []arr = {2,3,6,5,7,9,4};
        BFPRT bfprt = new BFPRT();
        //寻找第K小
        int min = bfprt.findMinK(arr , 0 , arr.length-1 , 3);
        System.out.println(min);
        //寻找第K大
        int max = bfprt.findMaxK(arr,0,arr.length-1,1);
        System.out.println(max);*/
    }
    @Test
    public void tes(){
        List<Integer> l  = new ArrayList<>();
        l.add(5);
        l.add(1);
        l.add(4);
        l.add(3);

    }
}
