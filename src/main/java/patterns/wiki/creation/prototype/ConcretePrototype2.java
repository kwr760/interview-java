package patterns.wiki.creation.prototype;

public class ConcretePrototype2 extends Prototype {
   public ConcretePrototype2() {
      this.a = "A2";
      this.b = "B2";
      this.displayConstruct();
   }

   @Override
   public Prototype clone() throws CloneNotSupportedException {
      return (ConcretePrototype2)super.clone();
   }
}
