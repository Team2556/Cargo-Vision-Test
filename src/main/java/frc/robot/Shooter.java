package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends TimedRobot {
    private final WPI_TalonFX ShooterMotor = new WPI_TalonFX(Constants.ShooterMotorPort);
    
    public void shooterInit() {
        ShooterMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 10);
    }

    public void setShooterSpeed(double setVelocity) {
        ShooterMotor.set(TalonFXControlMode.Velocity, setVelocity);
        SmartDashboard.putNumber("Shooter Motor Set Velocity", setVelocity);
    }

    public double getShooterSpeed() {
        SmartDashboard.putNumber("Shooter Motor Current Velocity", ShooterMotor.getSelectedSensorVelocity());
        return ShooterMotor.getSelectedSensorVelocity();
    }

    public boolean atSetpoint() {
        double setValue = SmartDashboard.getNumber("Shooter Motor Current Velocity", 0);
        double currentValue = SmartDashboard.getNumber("Shooter Motor Set Velocity", 1);
        double diff = Math.abs(setValue - currentValue);
        return (diff < 0.1);
    }
}
