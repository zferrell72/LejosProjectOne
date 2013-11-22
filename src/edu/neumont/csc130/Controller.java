package edu.neumont.csc130;

import lejos.util.Timer;
import lejos.util.TimerListener;

public class Controller {
	
	public static final int MAX_TIME = 1000*100;

	public static void main(String[] args) {

		// Initialize and start Timer on new thread

		Controller theProgram = new Controller();
		theProgram.start();
	}

	public void start() {

		// Initialize a timer on a new Thread
		Timer theTimer = new Timer(MAX_TIME, new MyTimerListener(Thread.currentThread()));
		theTimer.start();
		// create a new robot
		CanRemovalBot theBot = new CanRemovalBot();

		// While cans remain in the circle and time remains
		// tell robot to remove a can from the circle

		try {
			while (theBot.getCansRemoved() < 3) {
				theBot.removeCanFromCircle();
			}
			
			// Display the time
			
		} catch (InterruptedException e) {
			// You failed!
		}


	}

	private class MyTimerListener implements TimerListener {

		Thread mainThread;

		public MyTimerListener(Thread mainThreadReference) {
			mainThread = mainThreadReference;
		}

		@Override
		public void timedOut() {
			mainThread.interrupt();
		}

	}

}
