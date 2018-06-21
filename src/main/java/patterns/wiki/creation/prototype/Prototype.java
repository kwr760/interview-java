package patterns.wiki.creation.prototype;

public abstract class Prototype implements Cloneable {
   protected String a;
   protected String b;

   public Prototype clone() throws CloneNotSupportedException{
      return (Prototype) super.clone();
   }

   public void displayConstruct() {
      System.out.println("Construct:  " + this.a);
      System.out.println("Construct:  " + this.b);
   }

   public void displayClone() {
      System.out.println("Clone:  " + this.a);
      System.out.println("Clone:  " + this.b);
   }
}
