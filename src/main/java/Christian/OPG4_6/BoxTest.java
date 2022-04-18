package Christian.OPG4_6;

public class BoxTest {
    public static void main(String[] args) {


        Box box = new Box(2,9,39);
        System.out.println(box.getHight());
        System.out.println(box.getWidth());
        System.out.println(box.getDepth());
        System.out.println(box.getFull());

        box.setHight(15);
        System.out.println(box.getHight());

        box.setFull(true);
        System.out.println(box.getFull());
        System.out.println(box.toString());

        Box box1 = new Box(15, 12,13);
        System.out.println(box1.getFull());
    }
}
