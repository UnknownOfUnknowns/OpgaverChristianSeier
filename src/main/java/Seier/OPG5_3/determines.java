package Seier.OPG5_3;

import java.util.Scanner;


public class determines {

    public static void main(String[] args) {


        int number;
        int odd = 0, even = 0, nul = 0;

            Scanner input = new Scanner(System.in);
            System.out.println("Indtast et tal");

            number = input.nextInt();

            while (number > 0) {

                int mod = number % 10;
                number = number/10;

                if (mod % 2 == 0 && mod != 0) {
                    even++;
                    System.out.println(mod);
                    System.out.println("tallet er lige");


                }

                if (mod == 0) {
                    nul++;
                    System.out.println(mod);
                    System.out.println("tallet er 0");

                }

                if (mod % 2 != 0) {
                    odd++;
                    System.out.println(mod);
                    System.out.println("tallet er ulige");

                }

            }


        System.out.println(" Lige tal: " + even + " Ulige tal: " + odd + " Antal 0'er: " + nul);
        }
    }
