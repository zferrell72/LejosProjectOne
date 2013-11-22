package edu.neumont.csc130;

import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;



public class CanDetector {
	
	//	create an Ultrasonic sensor
	//	create a touch sensor
	//	has an integer value visualRange
	
	private UltrasonicSensor ultraSonic = new UltrasonicSensor(SensorPort.S3);
	private TouchSensor touch = new TouchSensor(SensorPort.S2);
	private static final int VISUALRANGE = 35;
	
	public CanDetector(){
		ultraSonic.continuous();
	}
	
	//	is can within a range?
	
	public boolean canWithinRange(){
		
		//	return if the ultrasonic captures an object within the given range
		
		return ultraSonic.getDistance() < VISUALRANGE;
	}
	
	//	is CanDetector in contact with can
	
	public boolean inContactWithCan() {
		
		//	return if touch sensor is pressed
		
		return touch.isPressed();
	}
}
