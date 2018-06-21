package patterns.gof.structure.adapter;

public class Shape {
   public void BoundingBox(Point bottomLeft, Point topRight) {
   }

   public Manipulator CreateManipulator() {
      return new Manipulator();
   }
}
