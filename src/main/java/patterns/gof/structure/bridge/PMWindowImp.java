package patterns.gof.structure.bridge;

public class PMWindowImp extends WindowImp {
   private HPS _hps;

   public void DeviceRect(Coord c1, Coord c2, Coord c3, Coord c4) {
      /*
      Coord left = min(xO, xl) ;
      Coord right = max(xO, xl);
      Coord bottom = min(yO, yl);
      Coord top = maxfyO, yl) ;
      PPOINTL point[4];
      point[0].x = left; point[0].y = top;
      point[l].x = right; point[1].y = top;
      point[2].x = right; point[2].y = bottom;
      point[3].x = left; point[3].y = bottom;
      if ((GpiBeginPath(_hps, 1L) == false) || (GpiSetCurrentPosition(_hps, &point[3]) == false)
         (GpiPolyLine(_hps, 4L, point) == GPI_ERROR) || (GpiEndPath(_hps) == false)) {
      } else {
         GpiStrokePath(_hps, 1L, OL);
      }
       */
   }

   public void ImpTop() { }
   public void ImpBottom() { }
   public void ImpSetExtent(Point pt) { }
   public void ImpSetOrigin(Point pt) { }
   public void DeviceText(String str, Coord coord1, Coord coord2) { }
   public void DeviceBitmap(String str, Coord coord1, Coord coord2) { }
}
