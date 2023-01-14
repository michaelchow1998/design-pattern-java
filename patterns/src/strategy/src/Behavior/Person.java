package strategy.src.Behavior;

import strategy.src.Behavior.game.GameBehavior;
import strategy.src.Behavior.sport.SportBehavior;


public class Person {
    private String name;
    private String sex;
    private int age;
    private SportBehavior sportBehavior;
    private GameBehavior gameBehavior;

    public Person(String name, String sex, int age, SportBehavior sportBehavior, GameBehavior gameBehavior) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.sportBehavior = sportBehavior;
        this.gameBehavior = gameBehavior;
    }
    public void playSport(){
        System.out.println(sportBehavior.play());
    }

    public void playGame(){
        System.out.println(gameBehavior.play());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SportBehavior getSportBehavior() {
        return sportBehavior;
    }

    public void setSportBehavior(SportBehavior sportBehavior) {
        this.sportBehavior = sportBehavior;
    }

    public GameBehavior getGameBehavior() {
        return gameBehavior;
    }

    public void setGameBehavior(GameBehavior gameBehavior) {
        this.gameBehavior = gameBehavior;
    }
}
