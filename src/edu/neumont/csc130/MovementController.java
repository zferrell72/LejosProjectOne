package edu.neumont.csc130;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;


public class MovementController {
	

	private NXTMotor leftMotor;
	private NXTMotor rightMotor;
	private final int turning = 35;
	private final int adjusting = 20;
	private final int forward = 40;
	private final int backward = 30;
	
	public MovementController(){
		leftMotor = new NXTMotor(MotorPort.C);
		rightMotor = new NXTMotor(MotorPort.A);
		stopBoth();
	}

	public void turnLeft(){
		rightMotor.setPower(turning);
		rightMotor.forward();
	}
	
	public void adjustRight(){
		leftMotor.setPower(adjusting);
		leftMotor.forward();
	}
	
	public void moveForward(){
		rightMotor.setPower(forward);
		leftMotor.setPower(forward);
		rightMotor.forward();
		leftMotor.forward();
	}
	
	public void moveBackward(){
		rightMotor.setPower(backward);
		leftMotor.setPower(backward);
		rightMotor.backward();
		leftMotor.backward();		
	}
	
	public void stopBoth(){
		rightMotor.stop();
		leftMotor.stop();
	}

}
