package patterns.wiki.creation.abstractfactory;

public class OSXButton implements IButton {
   @Override
   public void paint() {
      System.out.println("OSXButton");
   }
}
