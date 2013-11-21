package edu.neumont.csc130;

import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;



public class CanDetector {
	private UltrasonicSensor ultraSonic = new UltrasonicSensor(SensorPort.S3);
	private TouchSensor touch = new TouchSensor(SensorPort.S2);
	private static final int VISUALRANGE = 45;
	
	public CanDetector(){
		ultraSonic.continuous();
	}
	
	public boolean canWithinRange(){
		return ultraSonic.getDistance() < VISUALRANGE;
	}
	
	public boolean inContact() {
		return touch.isPressed();
	}
}
