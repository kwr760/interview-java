package patterns.gof.creation.factory;

public class BombedMazeGame extends MazeGame {
   public Wall MakeWall() {
      return new BombedWall();
   }

   public Room MakeRoom(int doors) {
      return new RoomWithABomb(doors);
   }
}
