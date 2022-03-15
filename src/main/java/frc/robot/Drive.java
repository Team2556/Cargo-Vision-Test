// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.kauailabs.navx.frc.AHRS;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.math.kinematics.MecanumDriveOdometry;
import edu.wpi.first.wpilibj.DigitalInput;
// import edu.wpi.first.math.kinematics.MecanumDriveOdometry;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Drive extends TimedRobot {
    private final CANSparkMax rFMotor = new CANSparkMax(Constants.rFMotorPort, MotorType.kBrushless);
    private final CANSparkMax rRMotor = new CANSparkMax(Constants.rRMotorPort, MotorType.kBrushless);
    private final CANSparkMax lFMotor = new CANSparkMax(Constants.lFMotorPort, MotorType.kBrushless);
    private final CANSparkMax lRMotor = new CANSparkMax(Constants.lRMotorPort, MotorType.kBrushless);

    // private final DigitalInput rFLimit = new DigitalInput(Constants.rFLimitPort);    
    // private final DigitalInput rRLimit = new DigitalInput(Constants.rRLimitPort);
    // private final DigitalInput lFLimit = new DigitalInput(Constants.lFLimitPort);
    // private final DigitalInput lRLimit = new DigitalInput(Constants.lRLimitPort);    

    // private final MotorControllerGroup rightMotors = new MotorControllerGroup(rFMotor, rRMotor);
    // private final MotorControllerGroup leftMotors = new MotorControllerGroup(lFMotor, lRMotor);

    private final MecanumDrive drive = new MecanumDrive(lFMotor, lRMotor, rFMotor, rRMotor);
    // private final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotors, rightMotors);
    // AHRS gyro = new AHRS(); // navX gyro
    
    // private final MecanumDriveOdometry odometry = 
    //     new MecanumDriveOdometry(
    //         Constants.DriveKinematics, 
    //         gyro.getRotation2d());

    // private final XboxController xbox = new XboxController(Constants.XboxControllerPort);
    // private Vision vision = new Vision();

    public void driveInit() {
        // gyro.reset();
        rFMotor.setInverted(true);
        rRMotor.setInverted(true);
    }
    
    public void mecanumDrive(double ySpeed, double xSpeed, double zRotation) {
        drive.driveCartesian(ySpeed, xSpeed, zRotation);
    }

    // public void dropDrive(double xSpeed, double zRotation) {
    //     differentialDrive.arcadeDrive(xSpeed, zRotation);
    // }

    // public void disableDrive() {
    //     differentialDrive.arcadeDrive(0, 0);
    // }
}