package patterns.gof.creation.factory;

public class MazeGame {
   public Maze MakeMaze() {
      return new Maze();
   }

   public Room MakeRoom(int doors) {
      return new Room(doors);
   }

   public Wall MakeWall() {
      return new Wall();
   }

   public Door MakeDoor(Room r1, Room r2) {
      return new Door(r1, r2);
   }

   public Maze CreateMaze() {
      Maze aMaze = MakeMaze();

      Room r1 = MakeRoom(1);
      Room r2 = MakeRoom(2);
      Door theDoor = MakeDoor(r1, r2);

      aMaze.AddRoom(r1);
      aMaze.AddRoom(r2);

      r1.SetSide(Direction.North, MakeWall());
      r1.SetSide(Direction.East, theDoor);
      r1.SetSide(Direction.South, MakeWall());
      r1.SetSide(Direction.West, MakeWall());

      r2.SetSide(Direction.North, MakeWall());
      r2.SetSide(Direction.East, MakeWall());
      r2.SetSide(Direction.South, MakeWall());
      r2.SetSide(Direction.West, theDoor);

      return aMaze;
   }
}
