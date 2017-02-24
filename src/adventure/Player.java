import java.util.*;
public class Player {
	
	private int room; // There's only 1 room right now, so this is the current location for the player.
	private ArrayList<String> items; //Player's stack
	private String name;

	public Player() {
		this.room = -1; // Indicating that he is in the room 0 in the index.	
		this.items = new ArrayList<String>(0);
		this.name = "Rocky";
	}

	//Since the room variable is private, we need the get method.
	public int getRoom(){ 
		return this.room;
	}

	public void setRoom(int x){ 
		this.room = x;
	}

	public void setName(String x){
		this.name = x;
	}

	public String getName(){
		return this.name;
	}

	//This is to update the current room of the Player.
	public void moveNext(){
		this.room +=1;
	}

	//This is to update the current room of the Player.
	public void moveBack(){
		this.room -=1;
	}

	//this will print out the lists of Item in the Player's Stash(inventory)
	public void getItems(){
		if(this.items.isEmpty()) {
			System.out.println("You do not have any item");
		}
		else {
				for(String i : this.items) {
					System.out.println("\n" + i);
				}
			}
	}

	public boolean addItem(String item){
		//this is where an item is added to the player's stash from the room
		return this.items.add(item);
	}

	public boolean useItem(String item){
		//this is where an item is used from the player's stash
		return this.items.remove(item);
	}


}

