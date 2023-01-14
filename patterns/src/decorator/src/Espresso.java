package decorator.src;

public class Espresso extends Beverage{

    public Espresso(Size size) {
        this.size = size;
        description = size +" HouseBlend";
    }


    public double cost() {
        return 1.99;
    }
}
