/*
An adventurer has:
•	A location (some room).
•	An inventory (the things being carried).  When the player executes the “take thing” command, the item should be added to the inventory.

An adventurer can:
•	Move from room to room.
•	Carry a number of objects.
•	Pick up, drop, look at, and use various objects.
*/

public class Player {
	private int room; // Basically since room is just 1, so this will be current room of player
	private String[] items;

	public Player() {
		this.room = 0; // Indicating that he is room at zero index.	
		this.items = new String(0);
	}

	//Since the room variable is private, we need the get method
	public int getroom(){ 
		return this.room;
	}

	//This is to update the room in which the Player is.
	public void movenext(){
		this.room +=1;
	}

	//This is to update the room in which the Player is.
	public void moveback(){
		this.room -=1;
	}

	//this will print out the lists of Item in the room
	public void getitems(){
		for(String i : this.items) {
			System.out.println(i);
		}
	}
}


