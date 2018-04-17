package personal.nathan.observer;

/**
 * Description:
 * <p>
 * Created by zhangwei on 2018/4/16.
 */
public class IncrementNumberGenerator extends NumberGenerator {

    private int number;

//    private int startNum;

    private int endNum;

    private int step;

    public IncrementNumberGenerator(int startNum, int endNum, int step) {
        number = startNum;
        //this.startNum = startNum;
        this.endNum = endNum;
        this.step = step;
    }

    public int getNumber() {
        return number;
    }

    public void execute() {
        while (number < endNum) {
            number += step;
//            System.out.println("IncrementNumberGenerator: " + number);
            notifiedObservers();
        }
    }
}
