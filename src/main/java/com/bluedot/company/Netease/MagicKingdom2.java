package com.bluedot.company.Netease;

import com.bluedot.util.MemoryUtil;
import com.bluedot.util.TimeUtil;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/7/25 22:38
 * @Description: 游历魔法王国---网易大题2
 */
public class MagicKingdom2 {
    public static void main(String[] args) {
        //计算时间
        long time1 = TimeUtil.getNowThreadUsedTime();
        //计算堆内存
        long heapMemory = MemoryUtil.getNowHeapMemory();
        //计算非堆内存
        long no_heapMemory = MemoryUtil.getNowNo_HeapMemory();



        System.out.println(TimeUtil.getNowThreadUsedTime()-time1);
        System.out.println(MemoryUtil.getNowHeapMemory()-heapMemory);
        System.out.println(MemoryUtil.getNowNo_HeapMemory()-no_heapMemory);
    }
}
