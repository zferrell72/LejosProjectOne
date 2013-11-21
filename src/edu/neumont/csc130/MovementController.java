package edu.neumont.csc130;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;


public class MovementController {
	

	private NXTMotor leftMotor;
	private NXTMotor rightMotor;
	
	public MovementController(){
		leftMotor = new NXTMotor(MotorPort.C);
		rightMotor = new NXTMotor(MotorPort.A);
	}

	public void turnAround(){
		rightMotor.setPower(50);
		rightMotor.forward();
		
	}
	
	public void moveForward(){
		rightMotor.forward();
		leftMotor.forward();
	}
	
	public void moveBackward(){
		rightMotor.backward();
		leftMotor.backward();		
	}
	
	public void stopBoth(){
		rightMotor.stop();
		leftMotor.stop();
	}

}
