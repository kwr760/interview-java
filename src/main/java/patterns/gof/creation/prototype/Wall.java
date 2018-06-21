package patterns.gof.creation.prototype;

public class Wall implements Cloneable {
   @Override
   public Wall clone() throws CloneNotSupportedException {
      return (Wall)super.clone();
   }
}
