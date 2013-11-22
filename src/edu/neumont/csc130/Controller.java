package edu.neumont.csc130;

import lejos.util.Timer;
import lejos.util.TimerListener;

public class Controller {

	
	public static void main(String[] args){
		
		//	Initialize and start Timer on new thread

		Controller theProgram = new Controller();
		theProgram.start();
	}
	
	public void start(){
		
		// 	Initialize a timer on a new Thread
		Timer theTimer = new Timer(1000, new MyTimerListener(Thread.currentThread()));
		theTimer.start();
		//	create a new robot
		CanRemovalBot theBot = new CanRemovalBot();
		
		//	While cans remain in the circle and time remains
		//	tell robot to remove a can from the circle

		while(theBot.getCansRemoved() < 3){
			theBot.removeCanFromCircle();
		}
		
		// 	Display the time
	}
	
	private class MyTimerListener implements TimerListener {
		
		Thread mainThread;
		
		public MyTimerListener(Thread mainThreadReference){
			mainThread = mainThreadReference;
		}
		
		@Override
		public void timedOut() {
			mainThread.interrupt();
		}
		
	}
	
}
