package decorator;

import decorator.src.*;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso(Size.TALL);
        System.out.println(beverage.getDescription() + " $"+ beverage.cost());

        Beverage beverage1 = new DarkRoast(Size.GRANDE);
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $"+ beverage1.cost());

        Beverage beverage2 = new HouseBlend(Size.VENTI);
        beverage2 = new Whip(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $"+ beverage2.cost());

    }
}
