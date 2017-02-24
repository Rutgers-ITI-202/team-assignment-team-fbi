import java.util.*;

public class Room {
	private int number;
	private String description;
	private boolean hasPlayer;
	private ArrayList<String> stuff;

	public Room(int n, String d){
		this.number = n;
		this.description = d;
		this.hasPlayer = false;
		this.stuff = new ArrayList<String>(0);
	}	

	public int getNumber(){
		return this.number;
	}

	public void updateHasPlayer(boolean x){
		this.hasPlayer = x;
	}

	public void showDescription(){
		System.out.println(this.description);
	}	

	//the item is added to the room
	public boolean addItemtoStuff(String x){
		return	this.stuff.add(x);	
	}

	//the item is taken from the room
	public boolean takeItemfromRoom(String x){
		return	this.stuff.remove(x);	
	}

	//Shows all the items present in the room
	public void showRoom() {
		System.out.println("Items in this room are!");
		for (String x : this.stuff)	{
			System.out.println(x);
			System.out.println();
		}
		System.out.println("*****************************");	
		System.out.println("You can take any item by using \'take item-name\'");
		System.out.println("*****************************");
	}

}

