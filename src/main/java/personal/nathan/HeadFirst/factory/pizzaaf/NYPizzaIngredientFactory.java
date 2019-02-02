package personal.nathan.HeadFirst.factory.pizzaaf;

import personal.nathan.HeadFirst.factory.pizzaaf.cheese.Cheese;
import personal.nathan.HeadFirst.factory.pizzaaf.cheese.ReggianoCheese;
import personal.nathan.HeadFirst.factory.pizzaaf.clams.Clams;
import personal.nathan.HeadFirst.factory.pizzaaf.clams.FreshClams;
import personal.nathan.HeadFirst.factory.pizzaaf.dough.Dough;
import personal.nathan.HeadFirst.factory.pizzaaf.dough.ThinCrustDough;
import personal.nathan.HeadFirst.factory.pizzaaf.pepperoni.Pepperoni;
import personal.nathan.HeadFirst.factory.pizzaaf.pepperoni.RedPepper;
import personal.nathan.HeadFirst.factory.pizzaaf.pepperoni.SlicedPepperoni;
import personal.nathan.HeadFirst.factory.pizzaaf.sauce.MarinaraSauce;
import personal.nathan.HeadFirst.factory.pizzaaf.sauce.Sauce;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Garlic;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Mushroom;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Onion;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() {
		return new ReggianoCheese();
	}
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
