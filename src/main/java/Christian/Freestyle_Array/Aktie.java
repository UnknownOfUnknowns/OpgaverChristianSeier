package Christian.Freestyle_Array;

import java.util.ArrayList;
import java.util.Collections;

public class Aktie {


    ArrayList<Double> historiskeAktieKurser = new ArrayList<>();


    public void tilføjAktiekurs (Double aktiekurs) {
        historiskeAktieKurser.add(aktiekurs);
    }

    public double maksKurs() {
        double højesteKurs = Collections.max(historiskeAktieKurser);
        return højesteKurs;
    }
    public double lavestKurs() {
        double lavesteKurs = Collections.min(historiskeAktieKurser);
        return lavesteKurs;
    }
    public double gennemsnitsKurs() {
       double gennemsnit = 0;
        for (Double aktie : historiskeAktieKurser) {
            gennemsnit += aktie;
        }
        return gennemsnit/historiskeAktieKurser.size();

    }

}
