package decorator_concreto;

import componente.Pizza;

import decorator.PizzaDecorator;

public class TomatoSauce extends PizzaDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Sauce");
	}

	public String getDescription() {
		return tempPizza.getDescription() + ", tomato sauce";
	}

	public double getCost() {
		System.out.println("Cost of Sauce: " + .35);
		return tempPizza.getCost() + .35;
	}

}
