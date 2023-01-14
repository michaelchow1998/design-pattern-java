package observer.src;

import java.util.ArrayList;
import java.util.List;

public class GamesData implements Subject{
    private List<Observer> observerList;
    private int nba2kNum;
    private int fifaNum;

    public GamesData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList){
            observer.update();
        }
    }

    public void gamesChanged(){
        notifyObservers();
    }

    public void setGames(int nba2kNum, int fifaNum){
        this.nba2kNum = nba2kNum;
        this.fifaNum = fifaNum;
        gamesChanged();
    }

    public int getNba2kNum() {
        return nba2kNum;
    }

    private void setNba2kNum(int nba2kNum) {
        this.nba2kNum = nba2kNum;
    }

    public int getFifaNum() {
        return fifaNum;
    }

    private void setFifaNum(int fifaNum) {
        this.fifaNum = fifaNum;
    }
}
