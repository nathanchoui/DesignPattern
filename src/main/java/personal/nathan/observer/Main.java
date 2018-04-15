package personal.nathan.observer;

/**
 * Description:
 * <p>
 * Created by nathan.z on 2018/4/15.
 */
public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer ob1 = new DigitObserver();
        Observer ob2 = new GraphObserver();
        numberGenerator.addObserver(ob1);
        numberGenerator.addObserver(ob2);
        numberGenerator.execute();
    }
}
