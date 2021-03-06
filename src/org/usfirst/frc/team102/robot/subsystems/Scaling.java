package org.usfirst.frc.team102.robot.subsystems;

import org.usfirst.frc.team102.robot.RobotMap;
import org.usfirst.frc.team102.robot.commands.Scale;
import org.usfirst.frc.team102.robot.commands.Scale.ScaleState;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Scaling extends Subsystem {

	public Talon leftScaleTal, rightScaleTal;

	public Scaling() {
		leftScaleTal = new Talon(RobotMap.leftScaleTalon);
		rightScaleTal = new Talon(RobotMap.rightScaleTalon);
	}

	protected void initDefaultCommand() {
		setDefaultCommand(new Scale());
	}

	public void startScaling(double speed) {
		leftScaleTal.set(speed);
		rightScaleTal.set(speed);
		System.out.println("Scale Speed: " + speed);
	}

	public void stopScaling() {
		leftScaleTal.set(0);
		rightScaleTal.set(0);
	}

	public void updateDashboard() {

		if (Scale.scale == ScaleState.none)
			SmartDashboard.putString("DB/String 2", " ");
		else if (Scale.scale == ScaleState.tapeUp)
			SmartDashboard.putString("DB/String 2", "SCALE: TAPE UP");
		else if (Scale.scale == ScaleState.robotUp)
			SmartDashboard.putString("DB/String 2", "SCALE: ROBOT UP");
		
		if (Scale.testScale == true)
			SmartDashboard.putString("DB/String 3", "MAN. SCALE");
		else
			SmartDashboard.putString("DB/String 3", " ");
	}
}