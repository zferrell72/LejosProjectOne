package edu.neumont.csc130;

public class CanRemovalBot {

	CanDetector canDetector;
	BoundaryDetector boundaryDetector;
	MovementController movement;
	SoundController sound;
	
	public CanRemovalBot(){
		canDetector = new CanDetector();
		boundaryDetector = new BoundaryDetector();
		movement = new MovementController();
		sound = new SoundController();
	}
	
	public void removeCanFromCircle(){
		
		boolean canFound = false;
		
		while(!canFound){
			canFound = scanForCan();
		}
	}
	
	public boolean scanForCan(){
		boolean canFound = false;
		
		
		
		return canFound;
	}
	
}