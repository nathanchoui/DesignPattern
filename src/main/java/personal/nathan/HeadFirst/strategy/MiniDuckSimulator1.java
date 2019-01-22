package personal.nathan.HeadFirst.strategy;

import personal.nathan.HeadFirst.strategy.duck.Duck;
import personal.nathan.HeadFirst.strategy.duck.MallardDuck;
import personal.nathan.HeadFirst.strategy.duck.ModelDuck;
import personal.nathan.HeadFirst.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
