package com.bluedot.util.common_mulriple_divisor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/9/17 16:22
 * @Description: 求集合内所有元素的最小公倍数------欧几里德算法【辗转相除法】
 */
public class CommonMulriple {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(2);
        arr.add(6);
        System.out.println(CommonMulriple(arr));
    }

    /**
     * 求集合内所有元素的最小公倍数---欧几里德算法【辗转相除法】
     * @param arr 原集合
     * @return 最大值
     */
    public static int CommonMulriple(List<Integer> arr) {

        int max  = Collections.max(arr);//获取最大值
        int result = 1;
        for(int i=2;i<=max;i++){
            boolean flag = false;//设置标记

            for(int j=0;j<arr.size();j++){
                if(arr.get(j)%i==0){
                    arr.set(j,arr.get(j)/i);
                    flag=true;
                    //只要有一个数可以被i整除就令标记为真，并改变可以被整除的那个值，改变的值将出现在辗转相除法的下一排
                    max = Collections.max(arr);//获取最大值,减少循环次数
                }
                //因为当前元素小于i，所以不可能被整除，将其移除可以减少循环次数
                if(arr.get(j)<i){
                    arr.remove(j);
                    j--;
                }
            }
            if(flag){
                result*=i;//标记为真说明辗转相除法还能继续；令使s累乘边上的数
                i--;
            }
        }
        return result;
    }
}
