package personal.nathan.HeadFirst.strategy;

import personal.nathan.HeadFirst.strategy.duck.*;
import personal.nathan.HeadFirst.strategy.fly.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
 
		Duck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
