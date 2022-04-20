package Christian.OPG4_9;

import java.util.Random;
// Mangler at lave en metode til sum af 2 terninger. Mangler også en metode til, at roll begge terninger på en gang.
public class PairOfDice {

    private int cubevalue;

    public PairOfDice(){
    this.cubevalue = cubevalue;
    }

    public int getCubevalue() {
        return cubevalue;
    }

    public void setCubevalue(int cubevalue) {
        this.cubevalue = cubevalue;
    }

    public void roll() {
        Random rand = new Random();
        cubevalue = rand.nextInt(6)+1;
    }


}
