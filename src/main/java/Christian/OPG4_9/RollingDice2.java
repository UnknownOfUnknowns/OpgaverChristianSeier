package Christian.OPG4_9;

public class RollingDice2 {
    public static void main(String[] args) {


        PairOfDice cube1 = new PairOfDice();
        PairOfDice cube2 = new PairOfDice();

        cube1.roll();
        cube2.roll();

        System.out.println(cube1.getCubevalue());
        System.out.println(cube2.getCubevalue());

        cube1.setCubevalue(4);
        System.out.println(cube1.getCubevalue());
    }
}
