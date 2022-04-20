package Seier.OPG4_8;

public class DurationTest {

    public static void main(String[] args) {

        Duration duration = new Duration (15, 17, 10, 15);

        System.out.println(duration.toString());

        duration.setSluthour(13);
        System.out.println(duration.toString());
    }
}
