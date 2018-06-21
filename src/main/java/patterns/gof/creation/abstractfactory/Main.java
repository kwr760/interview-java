package patterns.gof.creation.abstractfactory;

public class Main {
   public static void main(String[] args) {
      MazeGame game = new MazeGame();
      MazeFactory factory = new BombedMazeFactory();
      game.CreateMaze(factory);

      factory = new EnchantedMazeFactory();
      game.CreateMaze(factory);
   }
}
