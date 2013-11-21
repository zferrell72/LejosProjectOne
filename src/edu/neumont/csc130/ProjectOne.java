package edu.neumont.csc130;

public class ProjectOne {

	
	public static void main(String[] args){
		ProjectOne theProgram = new ProjectOne();
		theProgram.start();
	}
	
	public void start(){
		// Initialize a timer on a new Thread
		CanRemovalBot theBot = new CanRemovalBot();
		
		while(theBot.getCansRemoved() < 3){
			theBot.removeCanFromCircle();
		}
		
		// Display the time
	}
	
}
