package patterns.gof.structure.bridge;

public class IconWindow extends Window {
   private String _bitmapName;

   public IconWindow(View view) {
      super(view);
   }

   public void DrawContents() {
      WindowImp imp = GetWindowImp();
      if (imp != null) {
         imp.DeviceBitmap(this._bitmapName, new Coord(), new Coord());
      }
      GetView().DrawOn(this);
   }
}
