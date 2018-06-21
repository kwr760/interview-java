package patterns.gof.creation.abstractfactory;

public class MazeFactory {
   Maze MakeMaze() {
      return new Maze();
   }

   Wall MakeWall() {
      return new Wall();
   }

   Room MakeRoom(int doors) {
      return new Room(doors);
   }

   Door MakeDoor(Room r1, Room r2) {
      return new Door(r1, r2);
   }
}
