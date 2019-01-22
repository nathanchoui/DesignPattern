package personal.nathan.HeadFirst.strategy.duck;

import personal.nathan.HeadFirst.strategy.fly.FlyBehavior;
import personal.nathan.HeadFirst.strategy.quack.QuackBehavior;

/**
 * Created by za-zhangwei002 on 2019/1/21.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public Duck() {}

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void display();

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
