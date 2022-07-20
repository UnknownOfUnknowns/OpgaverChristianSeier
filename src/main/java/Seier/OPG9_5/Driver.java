package Seier.OPG9_5;

public class Driver {

    public static void main(String[] args) {

        Income indkomst = new Income("Indisk", "Programmør", "Mand", 28, 28000, 22000, 5000, 1000);

        System.out.println(indkomst.toString());

        indkomst.settax_returns(2500);
        System.out.println(indkomst.toString());

    }
}
