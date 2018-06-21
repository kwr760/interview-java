package patterns.gof.creation.singleton;

public class MazeFactory {
   MazeFactory instance = null;

   private MazeFactory() {
   }

   public MazeFactory getInstance() {
      if (null == this.instance) {
         this.instance = new MazeFactory();
      }

      return this.instance;
   }
}
