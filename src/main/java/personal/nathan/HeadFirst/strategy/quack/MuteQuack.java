package personal.nathan.HeadFirst.strategy.quack;

/**
 * Created by za-zhangwei002 on 2019/1/21.
 */
public class MuteQuack implements QuackBehavior {

    public void quack() {
        System.out.println("can not quack!");
    }
}
