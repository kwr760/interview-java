package patterns.wiki.structure.adapter;

public class Android implements IFormatAndroid {
   private boolean connectorOk = false;

   public void useMicroUsb() {
      this.connectorOk = true;
      System.out.println("MicroUsb connected ->");
   }

   public void recharge() {
      if(this.connectorOk) {
         System.out.println("Recharge Started");
         System.out.println("Recharge 20%");
         System.out.println("Recharge 50%");
         System.out.println("Recharge 70%");
         System.out.println("Recharge Finished");
      } else {
         System.out.println("Connect MicroUsb first");
      }
   }
}
