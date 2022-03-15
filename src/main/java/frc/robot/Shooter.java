package frc.robot;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXFeedbackDevice;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Shooter extends TimedRobot {
    private final WPI_TalonFX shooterMotor = new WPI_TalonFX(Constants.shooterMotorPort);
    
    public void shooterInit() {
        shooterMotor.configFactoryDefault();
        shooterMotor.setInverted(true);
        shooterMotor.configSelectedFeedbackSensor(TalonFXFeedbackDevice.IntegratedSensor, 0, 10);
    }

    // public void setShooterVelocity(double setVelocity) {
    //     shooterMotor.set(TalonFXControlMode.Velocity, setVelocity);
    //     SmartDashboard.putNumber("Shooter Motor Set Velocity", setVelocity);
    // }

    public double getShooterVelocity() {
        SmartDashboard.putNumber("Shooter Motor Current Velocity", shooterMotor.getSelectedSensorVelocity());
        return shooterMotor.getSelectedSensorVelocity();
    }

    // public boolean atVelocitySetpoint() {
    //     double setValue = SmartDashboard.getNumber("Shooter Motor Current Velocity", 0);
    //     double currentValue = SmartDashboard.getNumber("Shooter Motor Set Velocity", 1);
    //     double diff = Math.abs(setValue - currentValue);
    //     SmartDashboard.putBoolean("At Velocity Setpoint", diff < 0.5);
    //     return (diff < 500);
    // }

    public void setShooterPercent(double setPercent) {
        shooterMotor.set(TalonFXControlMode.PercentOutput, setPercent);
        SmartDashboard.putNumber("Shooter Motor Set Percent", setPercent);
    }

    public double getShooterPercent() {
        SmartDashboard.putNumber("Shooter Motor Current Percent", shooterMotor.getMotorOutputPercent());
        return shooterMotor.getMotorOutputPercent();
    }

    public boolean atPercentSetpoint() {
        double setPercent = SmartDashboard.getNumber("Shooter Motor Current Percent", 0);
        double currentPercent = SmartDashboard.getNumber("Shooter Motor Set Percent", 1);
        double diff = Math.abs(setPercent - currentPercent);
        SmartDashboard.putBoolean("At Percent Setpoint", diff < 0.5);
        return (diff < 0.1);
    }
}
