package edu.neumont.csc130;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class BoundaryDetector {

	LightSensor lightSensor = new LightSensor(SensorPort.S1);
	
	public BoundaryDetector(){
		lightSensor.calibrateHigh();
	}
	
	public boolean foundEdge(){
		return (lightSensor.readValue() < (lightSensor.getHigh() / 1.25));
	}
}
