package mode.timer;

import java.util.Timer;

/**
 * @author zhuguoxiang
 * @date 2018/08/21
 */
public class JobScheduleTest2 {
    public static void main(String[] args){
        //利用 java.util.Timer 实现任务调度
        Timer timer = new Timer();
        long delay = 2000;
        long period = 1000;
        //从现在开始两秒后启动，每隔一秒执行一次
        timer.schedule(new JobTask(), delay,period);
    }
}