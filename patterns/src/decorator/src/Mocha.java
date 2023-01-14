package decorator.src;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }


    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .10;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += .20;
        }else if(beverage.getSize() == Size.VENTI){
            cost += .30;
        }

        return cost;
    }


    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
