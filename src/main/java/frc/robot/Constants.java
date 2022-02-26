package frc.robot;

// import edu.wpi.first.math.geometry.Pose2d;
// import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
// import edu.wpi.first.math.kinematics.MecanumDriveOdometry;

public class Constants {
    
    // Drive Constants
    public static final int rFMotorPort = 1;
    public static final int rRMotorPort = 12;
    public static final int lFMotorPort = 4;
    public static final int lRMotorPort = 8;

    public static final double kTrackWidth = 0.5588;
    // Distance between centers of right and left wheels on robot
    public static final double kWheelBase = 0.762;
    // Distance between centers of front and back wheels on robot

    public static final MecanumDriveKinematics DriveKinematics =
        new MecanumDriveKinematics(
            new Translation2d(kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, -kTrackWidth / 2));

    // Shooter Constants
    public static final int ShooterMotorPort = 0;

    // Feeder Constants
    public static final int feederMotorPort = 0;

    // Elevator Constants
    

    // OI Constants
    public static final int XboxControllerPort = 0;

    // Vision Constants
    public static final int IMG_WIDTH = 320;
    public static final int IMG_HEIGHT = 240;

}
