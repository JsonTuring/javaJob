package mode.scheduled;

import mode.thread.JobThread;
import mode.timer.JobTask;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.*;

/**
 * @author zhuguoxiang
 * @date 2018/08/21
 */
public class JobScheduleTest3 {
    public static void main(String[] args){
        //池中保持的线程数量设置为2即最多可以支持两个任务同时执行
        ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
        //每次执行的间隔时间
        //每隔一秒执行一次
        long period = 1000;
        //每隔24小时执行一次
        //long period = 24 * 60 * 60 * 1000;
        //第一次执行的延迟时间
        //首次当前时间延迟两秒后执行
        long initialDelay = 2000;
        /*** 定制每日凌晨1:00执行方法 ***/
        //Calendar calendar = Calendar.getInstance();
        //calendar.set(Calendar.HOUR_OF_DAY, 1);
        //calendar.set(Calendar.MINUTE, 0);
        //calendar.set(Calendar.SECOND, 0);
        //long initialDelay  = calendar.getTimeInMillis() - System.currentTimeMillis();
        initialDelay = initialDelay > 0 ? initialDelay : period + initialDelay;
        //任务调度执行,多线程同时调度多个任务，互补影响
        service.scheduleAtFixedRate(new JobTaskRunnable(),initialDelay,period, TimeUnit.MILLISECONDS);
        service.scheduleAtFixedRate(new JobThread(),initialDelay,period, TimeUnit.MILLISECONDS);
    }
}