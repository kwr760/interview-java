package patterns.gof.creation.prototype;

import java.util.HashMap;

public class Room implements Cloneable  {
   public Room() {
   }

   public void initialize(int door) {
   }

   public void SetSide(Direction direction, Door door) {
   }

   public void SetSide(Direction direction, Wall wall) {
   }

   @Override
   public Room clone() throws CloneNotSupportedException {
      return (Room)super.clone();
   }
}
