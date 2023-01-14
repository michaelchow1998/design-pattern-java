package decorator.src;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        if(beverage.getSize() == Size.TALL){
            cost += .15;
        }else if(beverage.getSize() == Size.GRANDE){
            cost += 25;
        }else if(beverage.getSize() == Size.VENTI){
            cost += .35;
        }

        return cost;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
