package Christian.OPG8_5;

import java.util.ArrayList;
import java.util.Scanner;

public class Drivercompute {


    public static void main(String[] args) {
        ArrayList<Integer> drivernumbers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("indtast et tal og fortsæt indtil ikke flere inputs. tryk -1 for at afslutte");
        do {
            int tal = scan.nextInt();
            if(tal == -1) {
                break;
            }
            drivernumbers.add(tal);

        } while (true);
        Computeprint computeprint = new Computeprint(drivernumbers);
        System.out.println("mean = " + computeprint.mean());
        System.out.println("sd = " + computeprint.sd());

    }
}