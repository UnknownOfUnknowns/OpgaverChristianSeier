package Hans.OPG5_11;

import Christian.OPG4_9.PairOfDice;

import java.util.ArrayList;

public class BotPlayer extends Player{
    public BotPlayer(String name) {
        super(name);
    }

    @Override
    void takeTurn(PairOfDice pairOfDice) {
        int roundPoints = 0;
        while(true){
            ArrayList<Integer> dices = pairOfDice.rollpair();
            if(pairOfDice.getCubevalue() == 2){
                roundPoints = 0;
                points = 0;
                break;
            }
            if(dices.contains(1)){
                roundPoints = 0;
                break;
            }
            roundPoints += pairOfDice.getCubevalue();
            if(roundPoints >= 20){
                break;
            }
        }
        points += roundPoints;
        System.out.println(name + " has: " + points + " points");
    }
}
