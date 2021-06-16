package game;
import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] allRooms;
	
	public void init() {
		
		
		Room lr = new Room("living room", "A nice sized living room with a TV and couch.", 
				"The player walks into the house to see the living room first and sees that it connects to the dining room in the southern direction." + "\n" + "The dining room is connected to all rooms in thouse house." + "\n" + "To the east of the dining room is the gameroom, to the west of the dining room is the kitchen, and to the south of the dining room is the bedroom");
				this.allRooms[0] = lr;
				this.startingRoom = lr;
		Room kit = new Room("kitchen");
		Room br = new Room("bedroom");
		Room gr = new Room("game room");
		Room dr = new Room("dining room");
		
		
		allRooms = new Room[5];
		allRooms[0] = lr;
		allRooms[1] = kit;
		allRooms[2] = br;
		allRooms[3] = gr;
		allRooms[4] = dr;
		
		
		lr.setSouthExit(dr);
		
		dr.setNorthExit(lr);
		
		dr.setWestExit(gr);
		
		dr.setEastExit(kit);
		
		dr.setSouthExit(br);
		
		gr.setWestExit(dr);
		
		br.setNorthExit(dr);
		
		kit.setWestExit(dr);
		
		
		startingRoom = lr;
		
		}

	}

