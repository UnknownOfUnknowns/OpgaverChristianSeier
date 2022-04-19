package Seier.OPG4_6;

public class BoxTest {

    public static void main(String[] args) {

        Box box = new Box ( 5, 6,10);
        System.out.println(box.toString());

        System.out.println(box.getFull());

        box.setHeight(15);
        box.setWidth(25);
        box.setFull(true);
        System.out.println(box.toString());

        Box box1 = new Box(10, 10, 5);

        System.out.println(box1.toString());


    }
}
