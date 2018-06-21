package patterns.wiki.structure.adapter;

public class IPhoneRecharger {
   private IPhone phone;

   public IPhoneRecharger()
   {
      System.out.println("---Recharging iPhone with iPhone Recharger---");
      this.phone = new IPhone();
      this.phone.useLightning();
      this.phone.recharge();
      System.out.println("---iPhone Ready for use---");
   }
}
