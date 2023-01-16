package factory.simpleFactory;

import factory.simpleFactory.scr.Cake;
import factory.simpleFactory.scr.SimpleCakeFactory;

public class Main {
    public static void main(String[] args) {
        SimpleCakeFactory factory = new SimpleCakeFactory();
        Cake cake = factory.createCake("cheese");
        Cake cake2 = factory.createCake("chocolate");
        String name = cake.getName();
        String name2 = cake2.getName();
        System.out.println(name);
        System.out.println(name2);

    }
}
