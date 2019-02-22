package com.bluedot.util;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryUsage;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/7/19 22:23
 * @Description: 内存工具
 */
public class MemoryUtil {

    static final long MB = 1024 * 1024;

    public static MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();

    /**
     * 获取当前堆内内存
     * @return 当前已用堆内存
     */
    public static long getNowHeapMemory(){
        MemoryUsage heapUsage = memoryMXBean.getHeapMemoryUsage(); //椎内存使用情况
        return heapUsage.getUsed()/MB; //已使用的内存
    }

    /**
     * 获取当前非堆内存
     * @return当前已用非堆内存
     */
    public static long getNowNo_HeapMemory(){
        MemoryUsage no_headMemory = memoryMXBean.getNonHeapMemoryUsage();
        return no_headMemory.getUsed()/MB;
    }



}
