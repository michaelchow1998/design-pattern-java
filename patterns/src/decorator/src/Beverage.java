package decorator.src;

public abstract class Beverage {
    String description = "unknow Beverage";
    Size size;

    public String getDescription(){
        return description;
    }

    public Size getSize() {
        return size;
    }

    public abstract double cost();
}
