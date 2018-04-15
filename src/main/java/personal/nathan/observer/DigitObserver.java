package personal.nathan.observer;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public class DigitObserver implements Observer {

    public void update(NumberGenerator numberGenerator) {
        System.out.println("DigitObserver: " + numberGenerator.getNumber());
        try {
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
