package patterns.wiki.creation.abstractfactory;

public class OSXFactory implements IGUIFactory {
   @Override
   public IButton createButton() {
      return new OSXButton();
   }
}
