package patterns.wiki.creation.builder;

class CarBuilderImpl implements CarBuilder {
   private Car car;

   CarBuilderImpl() {
      car = new Car();
   }

   @Override
   public Car build() {
      return car;
   }

   @Override
   public CarBuilder setColor(final String color) {
      car.setColor(color);
      return this;
   }

   @Override
   public CarBuilder setWheels(final int wheels) {
      car.setWheels(wheels);
      return this;
   }
}
