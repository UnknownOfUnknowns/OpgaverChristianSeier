package Christian.OPG4_6;

public class Box {
    private double hight;
    private double width;
    private double depth;
    private boolean full;

    public Box(double h, double w, double d) {
        this.hight = h;
        this.width = w;
        this.depth = d;
        this.full = false;
    }


    public double getHight() {
        return hight;
    }
    public double getWidth() {
        return width;
    }
    public double getDepth() {
       return depth;
    }
    public boolean getFull() {
        return full;
    }

    public void setHight(double h) {
        this.hight = h;
    }
    public void setWidth(double w) {
        this.width = w;
    }
    public void setDepth(double d) {
        this.depth = d;
    }
    public void setFull(boolean f) {
        this.full = f;
    }


    @Override
    public String toString() {
        return "Box{" + "hight=" + hight + ", width=" + width + ", depth=" + depth + ", full=" + full + '}';
    }
}
