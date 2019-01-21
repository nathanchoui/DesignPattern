package personal.nathan.HeadFirst.strategy.fly;

/**
 * Created by za-zhangwei002 on 2019/1/21.
 */
public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("can not fly");
    }
}
