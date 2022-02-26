// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
// import edu.wpi.first.math.kinematics.MecanumDriveOdometry;
// import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
// import edu.wpi.first.wpilibj.interfaces.Gyro;

public class Drive extends TimedRobot {
    private final CANSparkMax rFMotor = new CANSparkMax(Constants.rFMotorPort, MotorType.kBrushless);
    private final CANSparkMax rRMotor = new CANSparkMax(Constants.rRMotorPort, MotorType.kBrushless);
    private final CANSparkMax lFMotor = new CANSparkMax(Constants.lFMotorPort, MotorType.kBrushless);
    private final CANSparkMax lRMotor = new CANSparkMax(Constants.lRMotorPort, MotorType.kBrushless);

    private final MecanumDrive drive = new MecanumDrive(lFMotor, lRMotor, rFMotor, rRMotor);
    // private final Gyro gyro = new ADXRS450_Gyro();
    // private final MecanumDriveOdometry odometry = 
    //     new MecanumDriveOdometry(
    //         Constants.DriveKinematics, 
    //         gyro.getRotation2d());

    private final XboxController xbox = new XboxController(Constants.XboxControllerPort);

    private Vision vision = new Vision();

    public void driveInit() {
        // gyro.reset();
        rFMotor.setInverted(true);
        rRMotor.setInverted(true);
    }

    public void spotRed() {

    }

    public void spotBlue() {

    }

    public void driveToCargo() {
        double turn = vision.visionTurn();
        drive.driveCartesian(0, 0, turn * 0.005);
    }
    public void teleDriveToCargo() {
        if (xbox.getAButton()) {
            double turn = vision.visionTurn();
            drive.driveCartesian(0, 0, turn * 0.005);    
        }
        else {
            drive.driveCartesian(xbox.getLeftY(), xbox.getLeftX(), xbox.getRightX());
        }
    }
}