package mode.thread;

import java.util.Calendar;

/**
 * @author zhuguoxiang
 * @date 2018/08/21
 */
public class JobThread extends Thread {
    @Override
    public void run(){
        while (true){
            System.out.println("ThreadTest:"+ Calendar.getInstance().getTime());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }

    }

}