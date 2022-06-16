package Christian.OPG8_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Arbitrary {

    public ArrayList<Integer> numbers = new ArrayList<>();
    int min_range = 0;
    int max_range = 50;
    Scanner input = new Scanner(System.in);

    public void insertNumber() {
        do {
            int tal = input.nextInt();

            if (tal > max_range || tal < min_range) {
                break;
            }
            numbers.add(tal);

        } while (true);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }



}