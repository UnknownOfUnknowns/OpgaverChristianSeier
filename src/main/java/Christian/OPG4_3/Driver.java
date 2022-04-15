package Christian.OPG4_3;

public class Driver {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.0, 5.0);

        System.out.println(cylinder.getAreal());
        System.out.println(cylinder.getVolume());

        System.out.println(cylinder.toString());
    }
}
