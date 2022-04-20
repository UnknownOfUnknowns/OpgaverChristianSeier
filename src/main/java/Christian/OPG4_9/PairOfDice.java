package Christian.OPG4_9;

import java.util.ArrayList;
import java.util.Random;
public class PairOfDice {

    private int cubevalue;

    public PairOfDice(){
    this.cubevalue = 1;
    }

    public int getCubevalue() {
        return cubevalue;
    }

    public void setCubevalue(int cubevalue) {
        this.cubevalue = cubevalue;
    }

    private int rollonce() {
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }
    public ArrayList<Integer> rollpair() {
        ArrayList<Integer> dices = new ArrayList<Integer>();
        dices.add(rollonce());
        dices.add(rollonce());
        cubevalue = 0;
        for (Integer dice: dices)
            cubevalue += dice;
        return dices;
    }

}
