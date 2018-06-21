package patterns.wiki.structure.adapter;

public class IPhoneAdapter  implements IFormatAndroid {
   private IFormatIPhone mobile;

   public IPhoneAdapter(IFormatIPhone mobile)
   {
      this.mobile = mobile;
   }

   public void recharge()
   {
      this.mobile.recharge();
   }

   public void useMicroUsb()
   {
      System.out.println("MicroUsb connected -> ");
      this.mobile.useLightning();
   }
}
