package observer.src;

public class NbaPlayer implements Observer, Monitor{
    private int nba2kNum;
    private GamesData gamesData;

    public NbaPlayer(GamesData gamesData) {
        this.gamesData = gamesData;
        gamesData.registerObserver(this);
    }

    @Override
    public void display() {
        String output = String.format("NBA 2k current remain number: %d", nba2kNum);
        System.out.println(output);
    }

    @Override
    public void update() {
       this.nba2kNum = gamesData.getNba2kNum();
        display();
    }
}
