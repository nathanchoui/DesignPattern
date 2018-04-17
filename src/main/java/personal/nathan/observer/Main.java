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
//        numberGenerator.execute();


        NumberGenerator incrementNumberGenerator = new IncrementNumberGenerator(0, 100, 5);
        incrementNumberGenerator.addObserver(ob1);
        incrementNumberGenerator.addObserver(ob2);
        incrementNumberGenerator.execute();
    }
}
