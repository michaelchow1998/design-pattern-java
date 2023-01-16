package factory.factoryMethod.src;


import factory.factoryMethod.src.pizza.NYStyleCheesePizza;
import factory.factoryMethod.src.pizza.NYStylePepperoniPizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
