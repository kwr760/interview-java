package patterns.gof.creation.builder;

public class Main {
   public static void main(String[] args) {
      MazeGame game = new MazeGame();
      MazeBuilder builder = new StandardMazeBuilder();

      game.CreateMaze(builder);
      Maze maze = builder.GetMaze();

      CounterMazeBuilder counter = new CounterMazeBuilder();
      game.CreateMaze(counter);
      System.out.println("The maze has " + counter.GetRoomCount() + " rooms and " + counter.GetDoorCount() + " doors");
   }
}
