package Seier.OPGstock;

import java.util.ArrayList;
import java.util.Collections;

public class Stock {

    String stockname;


    ArrayList<Double> listekurs = new ArrayList<Double>();


    public void addkurs(Double dagskurs) {

        listekurs.add(dagskurs);

    }

    public Stock(String aktienavn) {

        stockname = aktienavn;

    }


    public double maxkurs() {

        double max = 0;

        for (Double stock : listekurs) {

            if (stock > max) {
                max = stock;
            }
        }
        return max;

    }


    public double minkurs() {

        double min = listekurs.get(0);

        for (Double stock : listekurs) {

            if (stock < min) {
                min = stock;
            }

        }
        return min;

    }


    public double avgkurs() {

        double avgkurs = 0;

        for (Double stock : listekurs) {
            avgkurs += stock;

        }
        return avgkurs/listekurs.size();
    }

}
