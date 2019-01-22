package personal.nathan.HeadFirst.strategy.duck;

import personal.nathan.HeadFirst.strategy.quack.QuackBehavior;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
