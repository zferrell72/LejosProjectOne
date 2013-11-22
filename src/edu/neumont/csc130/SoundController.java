package edu.neumont.csc130;

import lejos.nxt.Sound;



public class SoundController {
	
	public static final int BEEPING_TONE = 1000;
	public static final int CONTINUOUS_TONE = 350;
	
	public void playContinuousTone(){
		Sound.playTone(CONTINUOUS_TONE, 300);
	}
	
	public void playBeepingTone(){
		Sound.playTone(BEEPING_TONE, 100);
	}
}
