package Christian.OPG4_3;

public class Driver {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(4.0, 5.0);

        System.out.println(cylinder.getAreal());
        System.out.println(cylinder.getVolume());

        System.out.println(cylinder.toString());



        Cylinder cylinder1 = new Cylinder(8.0,9.0);

        System.out.println(cylinder1.getAreal());
        System.out.println(cylinder1.getVolume());
        System.out.println(cylinder1);

    }
}
