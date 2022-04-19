package Christian.OPG_5_4;

import java.util.Random;
import java.util.Scanner;

public class Hi_Lo {

    public static void main(String[] args) {

        int tries = 0;
        String replay;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        int winningnum = generator.nextInt(100) + 1;
        int quessnum;
    do {
        do {
            if (tries == 0) {
                System.out.println("Guess the random generated number between 1-100");
            } else System.out.println("Try again, or press 0 to quit");
            quessnum = scan.nextInt();
            if (quessnum == 0) {
                break;
            }

            if (quessnum > winningnum) {
                System.out.println("The number is lower than your quess");
            }
            if (quessnum < winningnum) {
                System.out.println("the number is higher than your quess");
            }
            if (quessnum == winningnum) {
                System.out.println("Tilykke du har vundet spillet på " + tries + " forsøg:");
                break;
            }
            tries++;
        } while (true);
        System.out.println("Do you want another game write replay else write stop:");
        replay = scan.next();
        tries = 0;
        winningnum = generator.nextInt(100)+1;
    }while (replay.equals("replay"));
    }
}