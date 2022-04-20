package Hans.OPG5_11;

import Christian.OPG4_9.PairOfDice;

import java.util.ArrayList;
import java.util.Scanner;

public class PhysicalPlayer extends Player{
    Scanner scanner = new Scanner(System.in);

    public PhysicalPlayer(String name) {
        super(name);
    }

    @Override
    void takeTurn(PairOfDice pairOfDice) {
        System.out.println(name + " it is your turn press r to roll: ");
        int roundPoints = 0;
        while(true){
            String command = scanner.next();
            if(!command.equals("r"))
                break;
            ArrayList<Integer> dices = pairOfDice.rollpair();
            System.out.println("You rolled: " + dices.get(0) +", " + dices.get(1));
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
            System.out.println("This round you have gathered: " + roundPoints +" points");
        }
        points += roundPoints;
        System.out.println("You have: " + points +", points");
    }
}
