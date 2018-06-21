package patterns.wiki.creation.factory;

public class OrdinaryMazeGame extends MazeGame {
   @Override
   protected Room makeRoom() {
      return new OrdinaryRoom();
   }
}
