package patterns.gof.creation.builder;

class StandardMazeBuilder extends MazeBuilder {
   StandardMazeBuilder() {
      super();
      this.maze = null;
   }

   void BuildMaze() {
      this.maze = new Maze();
   }

   void BuildRoom(int n) {
      if (null == this.maze.RoomNo(n)) {
         Room room = new Room(n);
         this.maze.AddRoom(room);
         room.SetSide(Direction.North, new Wall());
         room.SetSide(Direction.East, new Wall());
         room.SetSide(Direction.South, new Wall());
         room.SetSide(Direction.West, new Wall());
      }
   }

   void BuildDoor(int n1, int n2) {
      Room r1 = this.maze.RoomNo(n1);
      Room r2 = this.maze.RoomNo(n2);
      Door d = new Door(r1, r2);

      r1.SetSide(new CommonWall(r1, r2), d);
      r2.SetSide(new CommonWall(r2, r1), d);
   }
}
