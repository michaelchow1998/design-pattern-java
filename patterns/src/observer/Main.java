package observer;

import observer.src.FifaPlayer;
import observer.src.GamesData;
import observer.src.NbaPlayer;

public class Main {

    public static void main(String[] args) {
        GamesData gamesData = new GamesData();

        NbaPlayer nbaPlayer = new NbaPlayer(gamesData);
        FifaPlayer fifaPlayer = new FifaPlayer(gamesData);

        gamesData.setGames(15,16);

        gamesData.setGames(20,10);

        gamesData.setGames(5,40);
    }
}
