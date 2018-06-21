package patterns.gof.structure.bridge;

public abstract class WindowImp {
   public abstract void ImpTop();
   public abstract void ImpBottom();
   public abstract void ImpSetExtent(Point pt);
   public abstract void ImpSetOrigin(Point pt);
   public abstract void DeviceRect(Coord c1, Coord c2, Coord c3, Coord c4);
   public abstract void DeviceText(String str, Coord coord1, Coord coord2);
   public abstract void DeviceBitmap(String str, Coord coord1, Coord coord2);

   protected WindowImp() {
   }
}
