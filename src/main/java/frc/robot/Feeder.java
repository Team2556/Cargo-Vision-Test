package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Feeder {
    private final CANSparkMax feederMotor = new CANSparkMax(Constants.feederMotorPort, MotorType.kBrushless);

    public void runIntake() {
        
    }
}
