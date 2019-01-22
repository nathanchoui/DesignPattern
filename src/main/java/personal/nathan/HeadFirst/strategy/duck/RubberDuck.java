package personal.nathan.HeadFirst.strategy.duck;

import personal.nathan.HeadFirst.strategy.fly.FlyNoWay;
import personal.nathan.HeadFirst.strategy.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
