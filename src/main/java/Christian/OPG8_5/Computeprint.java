package Christian.OPG8_5;

import java.util.ArrayList;

public class Computeprint {

    private ArrayList<Integer> numbers = new ArrayList<Integer>();

    Computeprint(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }


    public double mean() {
        int sum = 0;
        for(int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return (double)sum/numbers.size();
    }

    public double sd() {
        double sumsd = 0;
        for(int i=0; i < numbers.size(); i++){
            sumsd += Math.pow(numbers.get(i)-mean(),2);
        }
        Math.sqrt(sumsd);
        return sumsd;
    }
}
