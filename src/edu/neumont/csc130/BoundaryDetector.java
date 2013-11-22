package edu.neumont.csc130;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class BoundaryDetector {
	
	//has LightSensor

	LightSensor lightSensor = new LightSensor(SensorPort.S1);
	
	public BoundaryDetector(){
		lightSensor.calibrateHigh();
	}
	
	//has light sensor crossed cirlce 
	
	public boolean foundEdge(){
		
		//return if light sensor reads change
		
		return (lightSensor.readValue() < (lightSensor.getHigh() / 1.25));
	}
}
