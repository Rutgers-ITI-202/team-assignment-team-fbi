/*
This class:
•	Contains the main method used to start the game.
•	Talks to the AdventureModel and to the Adventurer classes, as needed.
We will make an adventure game based around FBI.
*/

import java.util.*;
import java.lang.*;

public class TextAdventure {

	static Scanner in = new Scanner(System.in);
	static boolean code = false;
	static CharSequence take = "take";

	public static String readInput(){
		String input = "";
		try{
			input = in.nextLine();
		}
		catch (NoSuchElementException e) {
			System.out.println("Error");
		}
		return input;
	}
/*
	public static int readint(){
		int input = 0;
		try{
			input = in.nextInt();
		}
		catch (NoSuchElementException e) {
			System.out.println("Error");
		}
		return input;	
	}
*/

	public static void main(String[] args) {
		System.out.println("You are an FBI agent working in the city of Gotham.\n You have entered an apartment complex in the worst part of the city");
		System.out.println("You enter the lobby, and an older man is sitting in the chair, and looks up at you.");
		System.out.println("What should we call you?");
		System.out.println("Please enter your name");
		String currentInput = readInput();
		
		while(currentInput.isEmpty()){
			System.out.println("Please enter a valid name");
			currentInput = readInput();	
		}

		//Right now creating a sample room, will update later.
		Room r1 = new Room(0, "Main Lobby");
		r1.addItemtoStuff("Journal");
		r1.addItemtoStuff("Magazine");

		//Creating a new player
		Player p1 = new Player();
		p1.setRoom(r1.getNumber());
		r1.updateHasPlayer(true);

		p1.setName(currentInput);
		System.out.println("Welcome " + p1.getName());

		System.out.println("We have a problem on our hands. Can you help?");
		System.out.println("Say Yes to continue");
		currentInput = readInput();

		while(!currentInput.equals("Yes")){
			System.out.println("Say Yes to continue");
			currentInput = in.nextLine();	
		}

		System.out.println("Great to hear, now follow the instructions for further information");
		System.out.println("**********************************************************");

		code = true;

		while(code) {
			System.out.println("Press 1 to look at items in the room");
			System.out.println("Press 2 to look at items in your Bag");
			currentInput = readInput();
			
			if(currentInput.equals("1")) {
				r1.showRoom();
			}

			if(currentInput.equals("2")) {
				p1.getItems();
			}

			if(currentInput.contains(take)) {
				//System.out.println(currentInput);
				//this a bit hard coded part
				String itemvalue = currentInput.substring(5);
				System.out.println(itemvalue);
				p1.addItem(itemvalue);
				r1.takeItemfromRoom(itemvalue); 
			}
		}


	}

}
