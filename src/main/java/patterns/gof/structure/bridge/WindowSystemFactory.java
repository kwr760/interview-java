package patterns.gof.structure.bridge;

public class WindowSystemFactory {
   private static WindowSystemFactory instance;

   public static WindowSystemFactory Instance() {
      return instance;
   }

   public WindowImp MakeWindowImp() {
      return new XWindowImp();
   }
}
