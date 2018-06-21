package patterns.wiki.creation.prototype;

public class ConcretePrototype1 extends Prototype {
   public ConcretePrototype1() {
      this.a = "A1";
      this.b = "B1";
      this.displayConstruct();
   }

   @Override
   public Prototype clone() throws CloneNotSupportedException {
      this.displayClone();
      return (ConcretePrototype1)super.clone();
   }
}
