package personal.nathan.HeadFirst.strategy.duck;

import personal.nathan.HeadFirst.strategy.fly.FlyNoWay;
import personal.nathan.HeadFirst.strategy.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
