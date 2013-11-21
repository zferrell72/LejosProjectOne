package edu.neumont.csc130;

public class CanRemovalBot {
	
	private CanDetector canDetector;
	private BoundaryDetector boundaryDetector;
	private MovementController movement;
	private SoundController sound;
	
	private int cansRemoved = 0;
	
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
		movement.stopBoth();
		try{
		Thread.sleep(100);
		} catch (Exception e) {}
		pushCan();
		resetPosition();
	}
	
	public void resetPosition(){
		try{
			movement.stopBoth();
			movement.moveBackward();
			Thread.sleep(2000);
			movement.stopBoth();
			movement.turnLeft();
			Thread.sleep(2000);
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void pushCan(){
		centerCanWithRobot();
		movement.moveForward();
		
		while(!boundaryDetector.foundEdge()){
			if(canDetector.inContactWithCan())
				sound.playContinuousTone();
		}
		if(canDetector.inContactWithCan())
			cansRemoved++;
	}
	
	public void centerCanWithRobot(){
		boolean canCentered;
		
		while(!(canCentered = canDetector.canWithinRange())){
				movement.adjustRight();			
		}
		movement.stopBoth();
	}
	
	public boolean scanForCan(){
		movement.turnLeft();
		return canDetector.canWithinRange();
	}
	
	public int getCansRemoved(){
		return cansRemoved;
	}
	
}