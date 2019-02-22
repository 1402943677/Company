package com.bluedot.company;

import org.junit.Test;

import java.util.*;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/17 17:17
 * @Description:
 */
public class GetMaxTest {

    /**
     * Java8获取数组的最大值
     */
    @Test
    public void testGetarrMax(){
        int[] arr = {6,1,14,7};

        OptionalInt maxOptionalInt = Arrays.stream(arr).max();

        int max = maxOptionalInt.getAsInt();

        System.out.println(max);
    }

    /**
     * 获取List中的最大值
     */
    @Test
    public void testGetListMax(){
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(6);
        int max = Collections.max(arr);
    }
}
