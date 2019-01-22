package personal.nathan.HeadFirst.strategy.duck;

import personal.nathan.HeadFirst.strategy.fly.FlyWithWings;
import personal.nathan.HeadFirst.strategy.quack.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
