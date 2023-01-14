package observer.src;

public class FifaPlayer implements Observer, Monitor{
    private int fifaNum;
    private GamesData gamesData;

    public FifaPlayer(GamesData gamesData) {
        this.gamesData = gamesData;
        gamesData.registerObserver(this);
    }

    @Override
    public void display() {
        String output = String.format("Fifa current remain number: %d", fifaNum);
        System.out.println(output);
    }

    @Override
    public void update() {
        this.fifaNum = gamesData.getFifaNum();
        display();
    }
}