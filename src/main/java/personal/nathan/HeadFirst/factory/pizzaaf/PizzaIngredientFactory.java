package personal.nathan.HeadFirst.factory.pizzaaf;

import personal.nathan.HeadFirst.factory.pizzaaf.cheese.Cheese;
import personal.nathan.HeadFirst.factory.pizzaaf.clams.Clams;
import personal.nathan.HeadFirst.factory.pizzaaf.dough.Dough;
import personal.nathan.HeadFirst.factory.pizzaaf.pepperoni.Pepperoni;
import personal.nathan.HeadFirst.factory.pizzaaf.sauce.Sauce;
import personal.nathan.HeadFirst.factory.pizzaaf.veggie.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
