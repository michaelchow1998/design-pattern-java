package factory.factoryMethod;

import factory.factoryMethod.src.ChicagoPizzaStore;
import factory.factoryMethod.src.NYPizzaStore;
import factory.factoryMethod.src.Pizza;
import factory.factoryMethod.src.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println(pizza.getName());
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println(pizza.getName());
    }
}
