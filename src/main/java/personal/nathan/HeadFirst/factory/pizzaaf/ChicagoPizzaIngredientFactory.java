package personal.nathan.HeadFirst.factory.pizzaaf;

import personal.nathan.HeadFirst.factory.pizzaaf.cheese.Cheese;
import personal.nathan.HeadFirst.factory.pizzaaf.cheese.MozzarellaCheese;
import personal.nathan.HeadFirst.factory.pizzaaf.clams.Clams;
import personal.nathan.HeadFirst.factory.pizzaaf.clams.FrozenClams;
import personal.nathan.HeadFirst.factory.pizzaaf.dough.Dough;
import personal.nathan.HeadFirst.factory.pizzaaf.dough.ThickCrustDough;
import personal.nathan.HeadFirst.factory.pizzaaf.pepperoni.Pepperoni;
import personal.nathan.HeadFirst.factory.pizzaaf.pepperoni.SlicedPepperoni;
import personal.nathan.HeadFirst.factory.pizzaaf.sauce.PlumTomatoSauce;
import personal.nathan.HeadFirst.factory.pizzaaf.sauce.Sauce;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.BlackOlives;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Eggplant;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Spinach;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Veggies;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory 
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
