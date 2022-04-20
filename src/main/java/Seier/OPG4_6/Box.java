package Seier.OPG4_6;

public class Box {

    private float height;
    private float width;
    private float depth;
    private boolean full;

    // constructor
    public Box(float height, float w, float d){
    this.height = height;
    width = w;
    depth = d;
    full = false;
    }

    // Getters
    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getDepth() {
        return depth;
    }

    public boolean getFull() {
        return full;
    }

    // Setters


    public void setHeight(float height) {
        this.height = height;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setDepth(float depth) {
        this.depth = depth;
    }

    public void setFull(boolean full) {
        this.full = full;
    }

    @Override
    public String toString() {
        return "Box{" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ", full=" + full +
                '}';
    }
}
