package Seier.OPG4_3;

public class MultiCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder((float) 100.0, (float) 5.0);
        System.out.println(cylinder.getHeight());
        System.out.println(cylinder.getRadius());
        System.out.println(cylinder.getVolume());
        System.out.println(cylinder.getSurfacearea());
        System.out.println(cylinder);
    }

}
