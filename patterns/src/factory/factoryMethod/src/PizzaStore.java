package factory.factoryMethod.src;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){

        return createPizza(type);
    }

    abstract Pizza createPizza(String type);
}
