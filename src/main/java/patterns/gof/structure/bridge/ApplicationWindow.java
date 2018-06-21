package patterns.gof.structure.bridge;

public class ApplicationWindow extends Window {
   public ApplicationWindow(View view) {
      super(view);
   }

   public void DrawContents() {
      GetView().DrawOn(this);
   }
}
