package com.tiy.storyline;

import java.util.Scanner;

public class Storyline {
	
	private String[] storyPath = new String[12];
	
	private int NETFLIX_AND_CHILL = 0;
	private int DATE_AND_DRINKS = 1;
	private int GO_TO_CLUB = 2;
	private int WHAT_NEXT = 3;
//	private int = 4;
//	private int = 5;
//	private int = 6; 
	Scanner keyboard =  new Scanner(System.in);

	public Storyline(){
		
		storyPath[0] = " Well then, lets netflix and chill. " + "\n" 
		+ "I will be waiting at my house for you to arrive.";
		storyPath[1] = "Ok then, a date and some drinks. " + "\n"
		+"Let's meet downtown and we can go from there.";
		storyPath[2] = "Oh schucks. We about to get krunk. " +"\n"
		+ "Meet you at the club and we can get our party on!";
		
		storyPath[3] = "Now what did you want to do?" + "\n" 
		+ "Enter A to go to sleep or B to drop you off?";
		storyPath[4] = "Kick you out and sleep by my self!";
		storyPath[5] = "Drop you off.";
		
		
		storyPath[6] = "Now what did you want to do?" + "\n" 
		+ "Enter A to ride in the passenger seat or B to take uber home?";
		storyPath[7] = "Im too drunk, here are the keys!";
		storyPath[8] = "We both too drunk, Uber me home!";
		
		storyPath[9] = "Now what did you want to do?" + "\n" 
		+ "Enter A to call it a night or B to stay out?";
		storyPath[10] = "I'm to tired to do anything else!";
		storyPath[11] = "Go to an afterparty!";
		
	}
		
	public void startStoryChoice (){
		
		boolean continueTheStory = true;
				
		while (continueTheStory){			
			System.out.println("Do you want to get together and do something?"
					+ "\n" + "Enter x to exit: ");
			
			System.out.println("Enter a for a relaxing evening" + "\n" 
					+ "Enter b for a night out" + "\n" 
					+ "Enter c to turn it up" + "\n" 
					+ "Enter choice here: ");
			
			String keyboardInput = keyboard.next();		
			
				switch(keyboardInput.toLowerCase()){
					case "a":
						stayInAndRelax();
						break;
					case "b":
						goOnADate();
						break;
					case "c":
						partyOn();
						break;	
					case "x":
						continueTheStory = false;
						break;
				}	
				
			}
		}
		
	private void stayInAndRelax(){
		System.out.println(storyPath[0]);
		System.out.println(storyPath[3]);
		String keyboardInput = keyboard.next();		
		
		switch(keyboardInput.toLowerCase()){
			case "a":
				System.out.println(storyPath[4]);
				break;
			case "b":
				System.out.println(storyPath[5]);
				break;
			default:
				return;
		}			
	}
	
	private void goOnADate(){
		System.out.println(storyPath[1]);
		System.out.println(storyPath[6]);
		String keyboardInput = keyboard.next();
		switch(keyboardInput.toLowerCase()){
		case "a":
			System.out.println(storyPath[7]);
			break;
		case "b":
			System.out.println(storyPath[8]);
			break;
		default:
			return;
		}			
	}
	
	private void partyOn(){
		System.out.println(storyPath[2]);
		System.out.println(storyPath[9]);
		String keyboardInput = keyboard.next();
		switch(keyboardInput.toLowerCase()){
		case "a":
			System.out.println(storyPath[10]);
			break;
		case "b":
			System.out.println(storyPath[11]);
			break;		
		default:
			return;
		}			
	}
public static void main(String[] args)
	{
		Storyline s = new Storyline();
		s.startStoryChoice();
	}
}
