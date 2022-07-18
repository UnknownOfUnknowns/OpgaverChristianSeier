package Christian.OPG8_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Arbitrary {

    public ArrayList<Integer> numbers = new ArrayList<>();
    int min_range = -25;
    int max_range = 25;
    Scanner input = new Scanner(System.in);

    public void insertNumber() {
        do {
            int tal = input.nextInt();

            if (tal > max_range || tal < min_range) {
                break;
            }
            numbers.add(tal);

        } while (true);

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);

            if(!numbers.subList(0, i).contains(number)) {
                int count = 0;
                for (Integer num : numbers) {
                    if(num.equals(number)) {
                        count++;
                    }
                }
                System.out.println("nummer:" + number + ", " + count + "times");
            }

        }
    }



}