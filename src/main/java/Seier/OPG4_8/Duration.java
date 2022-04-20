package Seier.OPG4_8;

import java.sql.Time;

public class Duration {

    private int starthour;
    private int sluthour;
    private int startmin;
    private int slutmin;

    //Constructor

public Duration (int sh, int slh, int sm, int slm){
    starthour = sh;
    sluthour = slh;
    startmin = sm;
    slutmin = slm;

}

public int getlength(){

    if (sluthour < starthour){
        return (24-starthour + sluthour) * 60 + (startmin - slutmin);
    }
    else return (sluthour - starthour) * 60 + (startmin - slutmin);
}

// Getter


    public int getStarthour() {
        return starthour;
    }

    public int getSluthour() {
        return sluthour;
    }

    public int getStartmin() {
        return startmin;
    }

    public int getSlutmin() {
        return slutmin;
    }
// setters


    public void setStarthour(int starthour) {
        this.starthour = starthour;
    }

    public void setSluthour(int sluthour) {
        this.sluthour = sluthour;
    }

    public void setStartmin(int startmin) {
        this.startmin = startmin;
    }

    public void setSlutmin(int slutmin) {
        this.slutmin = slutmin;
    }

    @Override
    public String toString() {
        return "[" + starthour + ":" + startmin + "] " + "[" + sluthour + ":" + slutmin + "]" + "\n" + "Der er " + getlength() + " minutter imellem intervallet";
    }
}
