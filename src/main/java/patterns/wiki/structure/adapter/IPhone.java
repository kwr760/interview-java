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
         System.out.println("Recharge 20%");
         System.out.println("Recharge 50%");
         System.out.println("Recharge 70%");
         System.out.println("Recharge Finished");
      } else {
         System.out.println("Connect Lightning first");
      }
   }
}
