package com.bluedot.util;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

/**
 * @Auther: 我爱双面奶
 * @Date: 2018/7/19 23:04
 * @Description: 时间工具
 */
public class TimeUtil {
    /**
     * 获取当前线程的cpu使用时间
     * @return
     */
    public static long getNowThreadUsedTime(){
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        return threadMXBean.getCurrentThreadCpuTime(); //当前线程的cpu使用时间
    }
}
