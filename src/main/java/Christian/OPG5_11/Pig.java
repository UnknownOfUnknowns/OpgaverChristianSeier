package Christian.OPG5_11;

import Christian.OPG4_9.PairOfDice;

import java.util.ArrayList;
import java.util.Scanner;

public class Pig {

    int sumPlayer1, sumComputer;

    PairOfDice die1 = new PairOfDice();
    PairOfDice die2 = new PairOfDice();
    Scanner playerinput = new Scanner(System.in);

    public void playPig() {
        while (sumPlayer1 < 100 && sumComputer < 100) {

            int roundPoints = 0;
            System.out.println("player 1 your turn: press r to roll:");
            String play1 = playerinput.next();
            while (true) {
                if (play1.equals("r")) {
                    ArrayList<Integer> result = die1.rollpair();
                    System.out.println("die1: " + result.get(0) + " die2: " + result.get(1));
                    roundPoints += die1.getCubevalue();
                    System.out.println("roundpoints: " + roundPoints + " sumplayer1 " + sumPlayer1);
                    if (die1.getCubevalue() == 2) {
                        sumPlayer1 = 0;
                        roundPoints = 0;
                        break;
                    } else if (result.contains(1)) {
                        roundPoints = 0;
                        break;
                    } else {
                        roundPoints += die1.getCubevalue();
                    }
                    System.out.print("wanna go again press r else press s:");
                    play1 = playerinput.next();
                } else{
                    break;
                }
            }

            sumPlayer1 += roundPoints;
            System.out.println("sum" + sumPlayer1);
            roundPoints = 0;

            System.out.println("Now its the computers turn:");
            while(true){
                ArrayList<Integer> comresult = die2.rollpair();
                System.out.println("die1: " + comresult.get(0) + " die2: " + comresult.get(1));
                roundPoints += die2.getCubevalue();
                System.out.println("roundpoints: " + roundPoints + " sumcomputer: " + sumComputer);
                if (die2.getCubevalue() == 2) {
                    sumComputer = 0;
                    roundPoints = 0;
                    break;
                }
                if (comresult.contains(1)) {
                    roundPoints = 0;
                    break;
                }
                if(roundPoints >= 20)
                    break;
            }

            sumComputer += roundPoints;
            System.out.println("sum:" + sumComputer);
        }
    }
}
