package frc.robot;

// import edu.wpi.first.math.geometry.Pose2d;
// import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.kinematics.MecanumDriveKinematics;
// import edu.wpi.first.math.kinematics.MecanumDriveOdometry;
import edu.wpi.first.math.util.Units;

public class Constants {
    
    // Drive Constants
    public static final int rFMotorPort = 4;
    public static final int rRMotorPort = 8;
    public static final int lFMotorPort = 3;
    public static final int lRMotorPort = 1;

    // public static final int rFLimitPort = 1;
    // public static final int rRLimitPort = 3;
    // public static final int lFLimitPort = 2;
    // public static final int lRLimitPort = 4;

    public static final double kTrackWidth = Units.inchesToMeters(22);
    // Distance between centers of right and left wheels on robot
    public static final double kWheelBase = Units.inchesToMeters(33);
    // Distance between centers of front and back wheels on robot

    public static final MecanumDriveKinematics DriveKinematics =
        new MecanumDriveKinematics(
            new Translation2d(kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(kWheelBase / 2, -kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, kTrackWidth / 2),
            new Translation2d(-kWheelBase / 2, -kTrackWidth / 2));

    // Shooter Constants
    public static final int shooterMotorPort = 7;
    public static final double shooterMotorFullVelocity = 20500.0;
    public static final int hoodMotorPort = 8;

    // Feeder Constants
    public static final int intakeMotorPort = 5;
    public static final int feederMotorPort = 6;
    public static final double intakeMotorSpeed = 0.5;
    public static final double feederMotorSpeed = 0.5;

    // Climber Constants
    public static final int climberMotorPort = 9;

    // OI Constants
    public static final int xboxControllerPort = 0;

    // Vision Constants
    // Constants such as camera and target height stored. Change per robot and goal!
    public static final double cameraHeightMeters = Units.inchesToMeters(38);
    public static final double targetHeightMeters = Units.inchesToMeters(3.5);
    // Angle between horizontal and the camera.
    public static final double cameraPitchRadians = Units.degreesToRadians(0);
    // How far from the target we want to be
    public static final double goalRangeMeters = Units.inchesToMeters(0);
    // PID constants should be tuned per robot
    public static final double visionLinearP = 0.1;
    public static final double visionLinearD = 0.0;
    public static final double visionAngularP = 0.0075;
    public static final double visionAngularD = 0.0;
}
