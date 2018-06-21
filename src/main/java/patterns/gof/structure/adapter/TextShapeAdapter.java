package patterns.gof.structure.adapter;

public interface TextShapeAdapter {
   public void BoundingBox(Point bottomLeft, Point topRight);

   public boolean IsEmpty();

   public Manipulator CreateManipulator();
}
