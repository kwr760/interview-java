package patterns.wiki.structure.adapter;

public class AndroidRecharger {
   private Android phone;

   public AndroidRecharger()
   {
      System.out.println("---Recharging Android Phone with Generic Recharger---");
      this.phone = new Android();
      this.phone.useMicroUsb();
      this.phone.recharge();
      System.out.println("---Phone Ready for use---");
   }
}
