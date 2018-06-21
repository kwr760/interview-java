package patterns.gof.creation.abstractfactory;

public class EnchantedMazeFactory extends MazeFactory {
   private Spell spell = new Spell();

   public Room MakeRoom(int doors) {
      return new EnchantedRoom(doors, this.CastSpell());
   }

   public Door MakeDoor(Room r1, Room r2) {
      return new DoorNeedingSpell(r1, r2);
   }

   private Spell CastSpell() {
      return this.spell;
   }
}
