package decorator.src;

public class HouseBlend extends Beverage{

    public HouseBlend(Size size) {
        this.size = size;
        description = size +" HouseBlend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
