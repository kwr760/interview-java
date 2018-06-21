package patterns.gof.creation.factory;

class EnchantedRoom extends Room {
   private Spell spell;

   EnchantedRoom(int doors, Spell spell) {
      super(doors);
      this.spell = spell;
   }
}
