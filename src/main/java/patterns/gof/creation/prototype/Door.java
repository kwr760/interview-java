package patterns.gof.creation.prototype;

public class Door implements Cloneable  {
   public Door() {
   }

   public void initialize(Room r1, Room r2) {
   }

   @Override
   public Door clone() throws CloneNotSupportedException {
      return (Door)super.clone();
   }
}
