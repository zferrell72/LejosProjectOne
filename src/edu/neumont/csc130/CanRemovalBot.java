package edu.neumont.csc130;

public class CanRemovalBot {
	
	private CanDetector canDetector;
	private BoundaryDetector boundaryDetector;
	private MovementController movement;
	private SoundController sound;
	
	private int cansRemoved = 0;
	
	public CanRemovalBot(){
		
		//	create a can detector
		//	create movementController
		//	create boundaryDetector
		//	create soundController
		
		canDetector = new CanDetector();
		boundaryDetector = new BoundaryDetector();
		movement = new MovementController();
		sound = new SoundController();
	}
	
	//	remove a can from the circle
	
	public void removeCanFromCircle(){
		
		boolean canFound = false;
		
		//	while no can has been found...
		
		while(!canFound){
			//	scan for can
			
			canFound = scanForCan();
		}
		movement.stopBoth();
		try{
		Thread.sleep(100);
		} catch (Exception e) {}
		
		//	push can
		
		pushCan();
		
		//	reset position
		
		resetPosition();
	}
	
	public void resetPosition(){
		movement.turnAround();
	}
	
	//	push the can out of the circle
	
	public void pushCan(){
		
		//	Center the can with the front of the robot
		//	tell the movementController to move forward
		
		centerCanWithRobot();
		movement.moveForward();
		
		//	while the boundaryDetector has not detected the circle’s edge...

		while(!boundaryDetector.foundEdge()){
			
		//	if the canDetector is in contact with the can,
		//	tell the soundController to play a continuous tone
			
			if(canDetector.inContactWithCan())
				sound.playContinuousTone();
		}
		
		// ** this needs to be different
		
		if(canDetector.inContactWithCan())
			cansRemoved++;
	}
	
	//	center the robot on the can
	
	public void centerCanWithRobot(){
		boolean canCentered;
		
		//	while can is not centered
		
		while(!(canCentered = canDetector.canWithinRange())){
			
			//	tell the movement controller to make a small adjustment to the right
			
				movement.adjustRight();			
		}
		movement.stopBoth();
	}
	
	//	scan for can returns a boolean value canFound
	
	public boolean scanForCan(){
		
		//	tell canDetector to scan for a can
		//	tell the movement controller to turn left
		
		movement.turnLeft();
		return canDetector.canWithinRange();
	}
	
	public int getCansRemoved(){
		return cansRemoved;
	}
	
}
