package patterns.gof.creation.prototype;

import patterns.gof.creation.abstractfactory.MazeFactory;

public class MazePrototypeFactory extends MazeFactory {
   private Maze maze;
   private Room room;
   private Wall wall;
   private Door door;

   public MazePrototypeFactory(Maze maze, Wall wall, Room room, Door door) {
      this.maze = maze;
      this.wall = wall;
      this.room = room;
      this.door = door;
   }

   public Wall MakeWall() throws CloneNotSupportedException {
      return this.wall.clone();
   }

   public Maze MakeMaze() throws CloneNotSupportedException {
      return this.maze.clone();
   }

   public Room MakeRoom(int door) throws CloneNotSupportedException {
      Room newRoom = this.room.clone();
      newRoom.initialize(door);
      return newRoom;
   }

   public Door MakeDoor(Room r1, Room r2) throws CloneNotSupportedException {
      Door newDoor = this.door.clone();
      newDoor.initialize(r1, r2);
      return newDoor;
   }
}
