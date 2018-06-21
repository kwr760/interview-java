package patterns.wiki.structure.adapter;

public class IPhone implements IFormatIPhone {
   private boolean connectorOk = false;

   public void useLightning() {
      this.connectorOk = true;
      System.out.println("Lightning connected - ");
   }

   public void recharge() {
      if(this.connectorOk) {
         System.out.println("Recharge Started");
         System.out.println("Recharge 25%");
         System.out.println("Recharge 50%");
         System.out.println("Recharge 75%");
         System.out.println("Recharge Finished");
      } else {
         System.out.println("Connect Lightning first");
      }
   }
}
