package patterns.gof.creation.builder;

class MazeGame {
   Maze CreateMaze(MazeBuilder builder) {
      builder.BuildMaze();

      builder.BuildRoom(1);
      builder.BuildRoom(2);
      builder.BuildDoor(1, 2);

      return builder.GetMaze();
   }

   Maze CreateComplexMaze(MazeBuilder builder) {
      for (int i = 1; i <= 1000; i++) {
         builder.BuildRoom(i);
      }

      return builder.GetMaze();
   }
}
