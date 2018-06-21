package patterns.gof.structure.adapter;

public class TextShape implements TextShapeAdapter {
   private Shape shape;
   private TextView textView;

   public TextShape(Shape shape, TextView textView) {
      this.shape = shape;
      this.textView = textView;
   }

   public void BoundingBox(Point bottomLeft, Point topRight) {
      Coord bottom = new Coord();
      Coord left = new Coord();
      Coord width = new Coord();
      Coord height = new Coord();

      textView.GetOrigin(bottom, left);
      textView.GetExtent(width, height);

      bottomLeft = new Point(bottom, left);
      topRight = new Point(bottom.add(height), left.add(width));
   }

   public boolean IsEmpty() {
      return textView.IsEmpty();
   }

   public Manipulator CreateManipulator() {
      return new TextManipulator();
   }
}
