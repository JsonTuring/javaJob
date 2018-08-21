package mode.timer;

import java.util.Calendar;
import java.util.TimerTask;

/**
 * @author zhuguoxiang
 * @date 2018/08/21
 */
public class JobTask extends TimerTask {
    //自定义一个任务，继承于 TimerTask，重写 run 方法
    @Override
    public void run() {
        System.out.println("TimerTaskTest:"+ Calendar.getInstance().getTime());
    }
}