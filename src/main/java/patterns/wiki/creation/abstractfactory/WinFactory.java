package patterns.wiki.creation.abstractfactory;

public class WinFactory implements IGUIFactory {
   @Override
   public IButton createButton() {
      return new WinButton();
   }
}
