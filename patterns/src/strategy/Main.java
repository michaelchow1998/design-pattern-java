package strategy;

import strategy.Behavior.game.PlayLoLBehavior;
import strategy.Behavior.game.PlayNothingBehavior;
import strategy.Behavior.sport.BasketballBehavior;

public class Main {

    public static void main(String[] args) {
        Person michael = new Person(
                "michael",
                "M",
                24,
                new BasketballBehavior(),
                new PlayLoLBehavior()
        );

        michael.playGame();
        michael.playSport();
        michael.setGameBehavior(new PlayNothingBehavior());
        michael.playGame();
    }
}
