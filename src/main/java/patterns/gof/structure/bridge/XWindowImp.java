package patterns.gof.structure.bridge;

public class XWindowImp extends WindowImp {
   private Display _dpy;
   private Drawable _winid;
   private GC _gc;

   public void DeviceRect(Coord c1, Coord c2, Coord c3, Coord c4) {
      /*
      int x = round(min(xO, xl));
      int y = round(min(yO, yl));
      int w = round(abs(xO - xl));
      int h = round(abs(yO - yl));
      XDrawRectangle(_dpy, _winid, _gc, x, y, w, h);
       */
   }

   public void ImpTop() { }
   public void ImpBottom() { }
   public void ImpSetExtent(Point pt) { }
   public void ImpSetOrigin(Point pt) { }
   public void DeviceText(String str, Coord coord1, Coord coord2) { }
   public void DeviceBitmap(String str, Coord coord1, Coord coord2) { }
}
