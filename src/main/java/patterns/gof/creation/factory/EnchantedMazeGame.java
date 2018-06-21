package patterns.gof.creation.factory;

public class EnchantedMazeGame extends MazeGame {
   public Room MakeRoom(int doors) {
      return new EnchantedRoom(doors, CastSpell());
   }

   public Door MakeDoor(Room r1, Room r2) {
      return new DoorNeedingSpell(r1, r2);
   }

   private Spell CastSpell() {
      return new Spell();
   }
}
