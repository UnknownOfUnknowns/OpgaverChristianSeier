package Seier.OPG5_11;

import Seier.OPG4_9.PairOfDice;

import java.util.Scanner;

public class PIG {

    public static PairOfDice pairofdice = new PairOfDice();

    public static int Playerpoints = 0;
    public static int Playerpointstotal = 0;
    public static int PCpoints = 0;
    public static int PCpointstotal = 0;
    public static String replay = "y";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            tagtur();
            System.out.println("Dice 1: " + pairofdice.getDice1());
            System.out.println("Dice 2: " + pairofdice.getDice2());
            Playerpoints += pairofdice.getDice1() + pairofdice.getDice2();

            if (pairofdice.getDice1() == 1 && pairofdice.getDice2() == 1) {
                Playerpoints=0;
                Playerpointstotal = 0;
                System.out.println("Du har nu " + Playerpoints + " point i denne tur.");
                System.out.println("og " + Playerpointstotal + " point total.");
                pctur();
                continue;

            }

            if (pairofdice.getDice1() == 1 || pairofdice.getDice2() == 1) {
                Playerpoints = 0;
                System.out.println("Du har nu " + Playerpoints + " point i denne tur.");
                System.out.println("og " + Playerpointstotal + " point total.");
                pctur();
                continue;
            }

            if (Playerpoints < 100) {
                System.out.println("Du har nu " + Playerpoints + " point i denne tur.");
                System.out.println("og " + Playerpointstotal + " point total.");
                System.out.println("Vil du fortsætte din tur? Y or N");
                replay = input.nextLine();

                if (replay.equalsIgnoreCase("N")) {
                    Playerpointstotal += Playerpoints;
                    Playerpoints = 0;
                pctur();
                continue;
                    }
                }

            if (Playerpoints >= 100) {
                System.out.println("Tillykke du har VUNDET!");
                break;

                }

            }
            while (Playerpointstotal < 100 || PCpointstotal < 100);


        }

        public static void pcrammeretter () {

            if (pairofdice.getDice1() == 1 || pairofdice.getDice2() == 1) {
                PCpoints = 0;
                System.out.println("Computeren har nu " + PCpoints + " point.");
                return;
            }

        }


        public static void tagtur () {

            pairofdice.rolldice();

        }

        public static void pctur() {

        do {
            tagtur();
            System.out.println("Terning 1: " + pairofdice.getDice1());
            System.out.println("Terning 2: " + pairofdice.getDice2());
            PCpoints += pairofdice.getDice1() + pairofdice.getDice2();

            if (pairofdice.getDice1() == 1 && pairofdice.getDice2() == 1) {
                PCpoints=0;
                PCpointstotal = 0;
                System.out.println("Computeren har nu " + PCpoints + " point.");
                System.out.println("Computeren har nu " + PCpointstotal + " points total.");
                return;

            }

            if (pairofdice.getDice1() == 1 || pairofdice.getDice2() == 1) {
                PCpoints = 0;
                System.out.println("Computeren har nu " + PCpoints + " point.");
                System.out.println("Computeren har nu " + PCpointstotal + " points total.");
                return;
            }

            System.out.println("Computeren har nu " + PCpoints + " point.");

            if (PCpoints > 20) {
                PCpointstotal += PCpoints;
                PCpoints = 0;
                System.out.println("Computeren har nu " + PCpoints + " point.");
                System.out.println("og " + PCpointstotal + " point total.");
                return;
            }

            if (PCpointstotal >= 100) {
                System.out.println("Computeren har VUNDET!");
            }

        } while (PCpoints < 20);

        }

    }

