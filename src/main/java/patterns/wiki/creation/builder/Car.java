package patterns.wiki.creation.builder;

class Car {
   /**
    * Represents the product created by the builder.
    */
   private int wheels;
   private String color;

   public Car() {
   }

   public String getColor() {
      return color;
   }

   public void setColor(final String color) {
      this.color = color;
   }

   public int getWheels() {
      return wheels;
   }

   public void setWheels(final int wheels) {
      this.wheels = wheels;
   }

   @Override
   public String toString() {
      return "Car [wheels = " + wheels + ", color = " + color + "]";
   }
}
