package Christian.OPG4_3;

public class Cylinder {

    private double radius;
    private double højde;


    public Cylinder (double r, double h) {
        this.radius = r;
        this.højde = h;
    }


    public double getHøjde() {
        return højde;
    }

    public double getRadius() {
        return radius;
    }

    public void setHøjde(double højde) {
        this.højde = højde;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
    return Math.PI*Math.pow(radius, 2)*højde;
    }

    public double getAreal() {
        return 2*Math.PI*radius*højde+2*Math.PI*Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", højde=" + højde +
                ", areal=" + getAreal() +
                '}';
    }
}