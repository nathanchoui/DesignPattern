package personal.nathan.HeadFirst.strategy;

import personal.nathan.HeadFirst.strategy.fly.FlyBehavior;
import personal.nathan.HeadFirst.strategy.quack.QuackBehavior;

/**
 * Created by za-zhangwei002 on 2019/1/21.
 */
public class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public Duck() {}

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performBehavior() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
