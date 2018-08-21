package mode.scheduled;

import java.util.Calendar;

/**
 * @author zhuguoxiang
 * @date 2018/08/21
 */
public class JobTaskRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("JobTaskRunnable:"+ Calendar.getInstance().getTime());

    }
}