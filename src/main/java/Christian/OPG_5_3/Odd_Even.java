package Christian.OPG_5_3;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        int odd = 0,even = 0,zero = 0;

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();


        while (num > 0) {
            int mod = num % 10;
            System.out.println(mod);
            num = num / 10;

            if(mod % 2 == 0 && mod != 0) {
                System.out.println("tallet er even");
                even++;
            }
            if(mod % 2 != 0 && mod != 0) {
                System.out.println("tallet er ulige");
                odd++;
            }
            if (mod == 0) {
                System.out.println("tallet er 0");
                zero++;
            }
        }
        System.out.println("even: " + even + " odd: " + odd + " zero: " + zero);

    }
}
