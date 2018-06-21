package patterns.wiki.creation.abstractfactory;

public class WinButton implements IButton {
   @Override
   public void paint() {
      System.out.println("WinButton");
   }
}
