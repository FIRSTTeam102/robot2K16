package org.usfirst.frc.team102.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	// Are we on the test bed?
	public static final boolean isTestBed = false;
	// Do we have USB Cameras?
	public static final boolean hasUSBCams = !isTestBed;
	// Do we have a distance sensor?
	public static final boolean hasDistanceSensor = !isTestBed;
	// Do we have the scaling mechanism?
	//public static final boolean hasScaleMotors = false;
	// Do we have the auto mode config switches?
	public static final boolean hasSwitches = false;
	// Do we have a fast vs. slow switch for auto-mode?
	public static final boolean hasFastSlowSwitch = false;
	// Do we have the ball handler relay?
	public static final boolean hasBallHandlerRelay = false;
	
	// How long it takes to scale the tower in each direction
	public static final double scaleTime = 3;
	
	// Multiplier for direction of auto mode drive
	public static final int dirMult = -1;
	
	// Auto mode speed constants
	public static final double autoModeSlowSpeed = .5;
	public static final double autoModeFastSpeed = .75;
	public static double autoModeNormalSpeed = 0; //temporary value
	
	//speed constant for ball handler
	public static final double ballGrabSpeed = .5;
	
	// USB camera IDs
	public static final int frontCameraID = 1;
	public static final int backCameraID = 3;
	
	// Joysticks
	public static final int driverJoystickPort = 0;
	public static final int operatorJoystickPort = 1;
	public static final int testJoystickPort = 2;

	// Joystick Axis's
	public static final int xBoxLeftXAxis = 0;
	public static final int xBoxLeftYAxis = 1;
	public static final int xBoxRightXAxis = 4;
	public static final int xBoxRightYAxis = 5;

	// Button Indexes
	public static final int xBoxAIndex = 1;
	public static final int xBoxBIndex = 2;
	public static final int xBoxXIndex = 3;
	public static final int xBoxYIndex = 4;
	public static final int xBoxLeftBumperIndex = 5;
	public static final int xBoxRightBumperIndex = 6;
	public static final int xBoxBackButtonIndex = 7;
	public static final int xBoxStartButtonIndex = 8;
	public static final int xBoxLeftJoystickPress = 9;
	public static final int xBoxRightJoystickPress = 10;
	public static final int xBoxLeftTriggerAxis = 2;
	public static final int xBoxRightTriggerAxis = 3;
	
	// Motors
	// CAN IDs.
	public static final int backRightMotor1 = 1;
	public static final int backLeftMotor2 = 2;
	public static final int frontRightMotor3 = 3;
	public static final int frontLeftMotor4 = 4;
	public static final int armMotor5 = 5;
	public static final int testBedRealMotor = 10;
	// public static final int m6 = 6;
	// public static final int m7 = 7;
	// PWMs
	// Servo Motor
	public static final int xAxisServo = 0;
	public static final int yAxisServo = 1;
	// The Talons
	public static final int ballHandlerTalon = 2;
	public static final int leftScaleTalon = 3;
	public static final int rightScaleTalon = 4;

	// Analog Inputs
	// Distance Sensors
	public static final int distanceSensorIndex = 0;
	// The Gyro
	public static final int theGryoAnalogID = 1;

	//Digital Inputs/Outputs
	// Switch Digital Inputs
	public static final int autoSwitch0 = 0;
	public static final int autoSwitch1 = 1;
	public static final int autoSwitch2 = 2;
	public static final int autoSwitch3 = 3;
	// Fast or slow switch
	public static final int fastSlowSwitchID = 8;
	// Momentary switches to disable arm movement
	public static final int armLimitSensorTop = 4;
	public static final int armLimitSensorBottom = 5;
	// Momentary switches to disable hoop movement
	public static final int hoopLimitSensorTop = 6;
	public static final int hoopLimitSensorBottom = 7;
	
	// Analog Inputs
	// (Nolonger used) Hardware LED reverse vs. forward indicators
	//public static final int forwardIndicator = 4;
	//public static final int backwardIndicator = 5;

	// Relay
	public static final int relay1 = 0;
}