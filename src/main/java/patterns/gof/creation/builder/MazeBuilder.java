package patterns.gof.creation.builder;

class MazeBuilder {
   protected Maze maze;

   void BuildMaze() {
   }

   void BuildRoom(int room) {
   }

   void BuildDoor(int roomFrom, int roomTo) {
   }

   Maze GetMaze() {
      return this.maze;
   }
}
