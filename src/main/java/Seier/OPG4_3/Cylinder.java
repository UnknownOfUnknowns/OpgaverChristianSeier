package Seier.OPG4_3;

 public class Cylinder {

   private float radius;
   private float height;

   public Cylinder(float r, float h){
       this.radius = r;
       this.height = h;
   }


     // Setter
     public void setRadius(float newRadius) {
         this.radius = newRadius;
     }
         public void setHeight(float newHeight) {
             this.height = newHeight;
     }

     // Getter
     public float getRadius() {
             return radius;
         }
     public float getHeight() {
         return height;

     }
     public double getVolume() {
         return Math.PI*Math.pow(radius,2)*height;
     }
     public double getSurfacearea() {
         return 2*Math.PI*radius*height+2*Math.PI*Math.pow(radius,2);

     }

     @Override
     public String toString() {
         return "Cylinder{" +
                 "radius=" + radius +
                 ", height=" + height +
                 ", volume=" + getVolume() +
                 '}';
     }
 }
