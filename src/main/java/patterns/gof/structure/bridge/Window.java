package patterns.gof.structure.bridge;

public class Window {
   private WindowImp  _imp;
   private View _contents;

   public Window(View contents) {
   }

   public void DrawContents() {}

   public void Open() {}
   public void Close() {}
   public void Iconify() {}
   public void Deiconify() {}

   public void SetOrigin(Point at) {}
   public void SetExtent(Point extent) {}
   public void Raise() {}
   public void Lower() {}

   public void DrawLine(Point pt1, Point pt2) {}
   public void DrawRect(Point pt1, Point pt2) {
      WindowImp imp = GetWindowImp();
      imp.DeviceRect(pt1.X(), pt1.Y(), pt2.X(), pt2.Y());
   }
   public void DrawPolygon(Point[] pts, int n) {}
   public void DrawText(String str, Point pt) {}

   protected WindowImp GetWindowImp() {
      if (_imp == null) {
         _imp = WindowSystemFactory.Instance().MakeWindowImp();
      }
      return _imp;
   }

   protected View GetView() {
      return _contents;
   }
}
