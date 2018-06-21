package patterns.gof.creation.prototype;

public class Maze implements Cloneable  {
   public Room RoomNo(int n) {
      return null;
   }

   public void AddRoom(Room room) {
   }

   @Override
   public Maze clone() throws CloneNotSupportedException {
      return (Maze)super.clone();
   }
}
