package decorator.src;

public class DarkRoast extends Beverage{

    public DarkRoast(Size size) {
        this.size = size;
        description = size +" DarkRoast";

    }


    public double cost() {
        return 2;
    }

}
