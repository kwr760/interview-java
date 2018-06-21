package patterns.gof.structure.bridge;

public class Point {
   public Coord X() {
      return new Coord();
   }

   public Coord Y() {
      return new Coord();
   }
}
