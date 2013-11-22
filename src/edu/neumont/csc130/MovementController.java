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
		
		//	turn left motor forward for a duration
		
		rightMotor.setPower(turning);
		rightMotor.forward();
	}
	
	public void adjustRight(){
		
		//	turns left motor forward slightly to adjust to centering a can
		
		leftMotor.setPower(adjusting);
		leftMotor.forward();
	}
	
	public void moveForward(){
		
		//	both motors move forward
		
		rightMotor.setPower(forward);
		leftMotor.setPower(forward);
		rightMotor.forward();
		leftMotor.forward();
	}
	
	public void moveBackward(){
		
		//	both motors move backward
		
		rightMotor.setPower(backward);
		leftMotor.setPower(backward);
		rightMotor.backward();
		leftMotor.backward();		
	}
	
	public void stopBoth(){
		
		//	both motors stop
		
		rightMotor.stop();
		leftMotor.stop();
	}

}
