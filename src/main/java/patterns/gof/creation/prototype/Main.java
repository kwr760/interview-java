package patterns.gof.creation.prototype;

public class Main {

   public static void main(String[] args) {
      MazeGame game = new MazeGame();
      MazePrototypeFactory simpleMazeFactory = new MazePrototypeFactory(
            new Maze(),
            new Wall(),
            new Room(),
            new Door()
      );
      Maze maze;
      try {
         maze = game.CreateMaze(simpleMazeFactory);
      } catch (CloneNotSupportedException e) {
      }

      MazePrototypeFactory bombedeMazeFactory = new MazePrototypeFactory(
            new Maze(),
            new BombedWall(),
            new RoomWithABomb(),
            new Door()
      );
      try {
         maze = game.CreateMaze(bombedeMazeFactory);
      } catch (CloneNotSupportedException e) {
      }
   }
}
