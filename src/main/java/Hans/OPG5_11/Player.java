package Hans.OPG5_11;

import Christian.OPG4_9.PairOfDice;

public abstract class Player {
    int points = 0;
    String name;
    public Player(String name){
        this.name = name;
    }
    abstract void takeTurn(PairOfDice dices);

    public boolean hasWon(){
        return points >= 100;
    }
}
