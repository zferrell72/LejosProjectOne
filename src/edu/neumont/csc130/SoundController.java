package edu.neumont.csc130;

import lejos.nxt.Sound;



public class SoundController {
	
	public static final int BEEPING_TONE = 1000;
	public static final int CONTINUOUS_TONE = 350;
	
	public void playContinuousTone(){
		Sound.playTone(CONTINUOUS_TONE, 300);
	}
	
	public void playBeepingTone(){
		// will play a beeping tone
		try {
        	for(int i = 0; i < 10; i++){
        		Sound.playTone(BEEPING_TONE, 95);
        		Thread.sleep(190);
        	}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
