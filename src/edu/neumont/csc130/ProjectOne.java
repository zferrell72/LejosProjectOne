package edu.neumont.csc130;

public class ProjectOne {

	
	public static void main(String[] args){
		
		//	Initialize and start Timer on new thread

		ProjectOne theProgram = new ProjectOne();
		theProgram.start();
	}
	
	public void start(){
		
		// 	Initialize a timer on a new Thread
		//	create a new robot
		
		CanRemovalBot theBot = new CanRemovalBot();
		
		//	While cans remain in the circle and time remains….
		//	tell robot to remove a can from the circle

		while(theBot.getCansRemoved() < 3){
			theBot.removeCanFromCircle();
		}
		
		// 	Display the time
	}
	
}
