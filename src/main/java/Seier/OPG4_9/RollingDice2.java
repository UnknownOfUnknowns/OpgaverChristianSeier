package Seier.OPG4_9;

public class RollingDice2 {

    public static void main(String[] args) {

        PairOfDice pairofdice = new PairOfDice();

        System.out.println(pairofdice);
System.out.println(pairofdice);
pairofdice.rolldice();
        System.out.println(pairofdice);

        pairofdice.setDice1(4);
        pairofdice.setDice2(4);
        System.out.println(pairofdice);

    }


}
