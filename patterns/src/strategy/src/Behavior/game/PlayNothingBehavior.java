package strategy.src.Behavior.game;

public class PlayNothingBehavior implements GameBehavior{
    @Override
    public String play() {
        return "Never play game";
    }
}
