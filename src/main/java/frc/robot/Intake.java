package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;

public class Intake extends TimedRobot {
    private final CANSparkMax intakeMotor = new CANSparkMax(Constants.intakeMotorPort, MotorType.kBrushless);
    private final CANSparkMax feederMotor = new CANSparkMax(Constants.feederMotorPort, MotorType.kBrushless);

    public void runIntake() {
        intakeMotor.set(Constants.intakeMotorSpeed);
        feederMotor.set(Constants.feederMotorSpeed);
    }

    public void stopIntake() {
        intakeMotor.set(0);
        feederMotor.set(0);
    }
}
