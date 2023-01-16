package factory.simpleFactory.scr;

public class SimpleCakeFactory {

    public Cake createCake(String type){
        Cake cake  = null;

        if(type.equals("cheese")){
            cake = new CheeseCake();
        }else if(type.equals("chocolate")){
            cake = new ChocolateCake();
        }

        return cake;
    }
}
