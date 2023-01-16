package factory.factoryMethod.src;

import factory.factoryMethod.src.pizza.ChicagoStyleCheesePizza;
import factory.factoryMethod.src.pizza.ChicagoStylePepperoniPizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        }else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
