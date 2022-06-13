package Seier.OPG5_4;


import java.util.Scanner;

public class HIGHLOW {

    public static void main(String[] args) {

        Scanner spilscanner = new Scanner(System.in);
        String replay;

        do {
            spiligen();

            System.out.println("Vil du spille igen? Y or N");
            replay = spilscanner.next();

                    if (replay.equals("N")){
                        System.out.println("Tak for spillet. På gensyn.");
                    }

        } while (replay.equals("Y"));
    }

    public static void spiligen() {

        System.out.println("Indtast et tal");

        int tal = (int) (Math.random() * 100 + 1);

        Scanner input = new Scanner(System.in);

        int talcompare = input.nextInt();

        int forsoeg = 0;


        while (true) {

            forsoeg++;

            if (talcompare == tal) {
                System.out.println("TILLYKKE DU HAR VUNDET!!!!");
                System.out.println("Du har brugt " + forsoeg + " antal forsøg");
                break;
            }


            if (talcompare > tal) {
                System.out.println("Dit gæt er for højt. Tallet er lavere");
                System.out.println("prøv igen!");

            }

            if (talcompare < tal) {
                System.out.println("Dit gæt er for lavt. Tallet er højere");
                System.out.println("prøv igen!");
            }

            talcompare = input.nextInt();

        }

    }

        }





