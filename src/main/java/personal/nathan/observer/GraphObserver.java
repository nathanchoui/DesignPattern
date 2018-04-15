package personal.nathan.observer;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public class GraphObserver implements Observer {

    public void update(NumberGenerator numberGenerator) {
        System.out.print("GraphObserver:");
        int count = numberGenerator.getNumber();
        for (int i = 0; i < count; i ++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            TimeUnit.SECONDS.sleep(10);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
