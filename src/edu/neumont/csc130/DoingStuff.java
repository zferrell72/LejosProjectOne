package edu.neumont.csc130;

import lejos.nxt.LightSensor;
import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;
import lejos.nxt.SensorPort;
import lejos.nxt.Sound;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;

public class DoingStuff {

//	public static void main(String[] args) {
//		
//
//		MovementController movement = new MovementController();
//		movement.adjustRight();
//		
//		
//		UltrasonicSensor sonicSensor = new UltrasonicSensor(SensorPort.S3); 
//		LightSensor lightSensor = new LightSensor(SensorPort.S1);
//		NXTMotor leftMotor = new NXTMotor(MotorPort.C);
//		NXTMotor rightMotor = new NXTMotor(MotorPort.A);
//		TouchSensor touchSensor = new TouchSensor(SensorPort.S2);
//		
//		
//		lightSensor.setFloodlight(true);
//		lightSensor.calibrateHigh();
//
//		rightMotor.setPower(50);
//		rightMotor.forward();
//		
//		sonicSensor.continuous();
//		
//		boolean canFound = false;
//		
//		while(!canFound){
//			if(sonicSensor.getDistance() < 30){
//				try{
//					Thread.sleep(700);
//				} catch(Exception e){
//					
//				}
//				rightMotor.stop();
//				canFound = true;
//				System.out.println("I FOUND A MOFUCKIN CAN!!!");
//			}
//		}
//		
//		leftMotor.setPower(30);
//		rightMotor.setPower(30);
//		leftMotor.forward();
//		rightMotor.forward();
//		
//		boolean edgeFound = false;
//		
//		while(!edgeFound){
//			if(touchSensor.isPressed()){
//				Sound.twoBeeps();
//			}
//			if(lightSensor.readValue() < (lightSensor.getHigh() / 2)){
//				leftMotor.stop();
//				rightMotor.stop();
//				edgeFound = true;
//			}
//				
//		}
		

		
//		sonicSensor.continuous();
//		while(sonicSensor.getDistance() > 10){
//			
//		}
//	}

}
