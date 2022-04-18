package Christian.OPG4_8;

public class DurationTest {
    public static void main(String[] args) {
        Duration duration = new Duration(15,19,30,45);
        System.out.println(duration.getStart_hour() + "," + duration.getStart_minute() + "," + duration.getStart_minute() + "," + duration.getEnd_minute());


        duration.setEnd_hour(01);
        System.out.println(duration.toString());


        System.out.println(duration.getLength() );

    }

}
