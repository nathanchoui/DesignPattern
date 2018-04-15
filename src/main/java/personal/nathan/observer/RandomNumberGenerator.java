package personal.nathan.observer;

import java.util.Random;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    public int getNumber() {
        return number;
    }

    public void execute() {
        for (int i = 0; i < 10; i ++) {
            number = random.nextInt(100) + 1;
            notifiedObservers();
        }
    }
}
