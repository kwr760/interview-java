package patterns.gof.creation.builder;

class CounterMazeBuilder extends MazeBuilder {
   private int doors;
   private int rooms;

   CounterMazeBuilder() {
      super();
      this.doors = 0;
      this.rooms = 0;
   }

   void BuildMaze() {
      this.maze = new Maze();
   }

   void BuildRoom(int n) {
      this.rooms++;
   }

   void BuildDoor(int n1, int n2) {
      this.doors++;
   }

   public int GetRoomCount() {
      return this.rooms;
   }

   public int GetDoorCount() {
      return this.doors;
   }
}
