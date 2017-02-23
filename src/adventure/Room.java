public class Room {
	private int number;
	private String description;
	private boolean hasPlayer;
	private String[] stuff;

	public Room(int n, String d){
		this.number = n;
		this.description = d;
		this.hasPlayer = false;
		this.stuff = new String[5];
	}	

	public int getNumber(){
		return this.number;
	}

	public void showDescription(){
		System.out.println(this.description);
	}	

	public void getstuff() {
		for (String x : this.stuff)
			System.out.print(x);
	}

}

