package patterns.gof.creation.abstractfactory;

public class BombedMazeFactory extends MazeFactory {
   Wall MakeWall() {
      return new BombedWall();
   }

   Room MakeRoom(int doors) {
      return new RoomWithABomb(doors);
   }
}
