package strategy.Behavior.sport;

public class NoSportBehavior implements SportBehavior{
    @Override
    public String play() {
        return "Never sport";
    }
}
