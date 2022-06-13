package Seier.OPG4_9;
import java.util.Random;

public class PairOfDice {

int dice1 = (int) (Math.random()*6+1);
int dice2 = (int) (Math.random()*6+1);

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public void setDice2(int dice2) {
        this.dice2 = dice2;
    }

    public void rolldice() {
    dice1 = (int) (Math.random()*6+1);
    dice2 = (int) (Math.random()*6+1);


}

public void returndices() {
    System.out.println(dice1 + dice2);
}

    @Override
    public String toString() {
        return "PairOfDice{" +
                "dice1=" + dice1 +
                ", dice2=" + dice2 +
                '}';
    }
}
