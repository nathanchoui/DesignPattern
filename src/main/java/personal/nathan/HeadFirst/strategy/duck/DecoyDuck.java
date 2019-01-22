package personal.nathan.HeadFirst.strategy.duck;

import personal.nathan.HeadFirst.strategy.fly.FlyNoWay;
import personal.nathan.HeadFirst.strategy.quack.MuteQuack;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
