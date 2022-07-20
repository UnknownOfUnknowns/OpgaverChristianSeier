package Christian.OPG9_5;

import javax.xml.crypto.Data;
import java.util.ArrayList;

public class CountryDriver {
    public static void main(String[] args) {
        Person person = new Person("Africa", "unemployed", 59, 25);

        Africa africa = new Africa("Africa", "employed", 150, 25, "Dark", 135);
        Africa africa1 = new Africa("Africa", "employed", 100, 20, "DARK", 222);
        ArrayList<Person> myArray = new ArrayList<>();
        myArray.add(person);
        myArray.add(africa);
        myArray.add(africa1);
        DataAnalyse analyse = new DataAnalyse(myArray);

        analyse.gennemsnitIncome();

    }

}
