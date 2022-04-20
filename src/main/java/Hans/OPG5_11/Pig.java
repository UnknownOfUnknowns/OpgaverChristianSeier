package Hans.OPG5_11;

import Christian.OPG4_9.PairOfDice;

import java.util.ArrayList;
import java.util.Scanner;

public class Pig {
    private int pointPlayer = 0, pointComputer = 0;
    private Scanner scanner = new Scanner(System.in);
    private boolean winnerFound = false;
    private PairOfDice pairOfDice = new PairOfDice();

    public void playPig(){
        while (!winnerFound){
            playerTakeTurn();
            computerTakeTurn();
        }
    }

    private void playerTakeTurn(){
        System.out.println("It is your turn press r to roll: ");
        int roundPoints = 0;
        while(true){
            String command = scanner.next();
            if(!command.equals("r"))
                break;
            ArrayList<Integer> dices = pairOfDice.rollpair();
            System.out.println("You rolled: " + dices.get(0) +", " + dices.get(1));
            if(pairOfDice.getCubevalue() == 2){
                roundPoints = 0;
                pointPlayer = 0;
                break;
            }
            if(dices.contains(1)){
                roundPoints = 0;
                break;
            }
            roundPoints += pairOfDice.getCubevalue();
            System.out.println("This round you have gathered: " + roundPoints +" points");
        }
        pointPlayer += roundPoints;
        System.out.println("You have: " + pointPlayer +", points");
        if(pointPlayer >= 100)
            winnerFound = true;
    }

    private void computerTakeTurn(){
        int roundPoints = 0;
        while(true){
            ArrayList<Integer> dices = pairOfDice.rollpair();
            if(pairOfDice.getCubevalue() == 2){
                roundPoints = 0;
                pointComputer = 0;
                break;
            }
            if(dices.contains(1)){
                roundPoints = 0;
                break;
            }
            roundPoints += pairOfDice.getCubevalue();
            if(roundPoints > 20)
                break;
        }
        pointComputer += roundPoints;
        if(pointComputer >= 100)
            winnerFound = true;
    }
}
