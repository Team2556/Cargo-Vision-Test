package frc.robot;


import org.photonvision.PhotonCamera;
import org.photonvision.PhotonUtils;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj.TimedRobot;

public class CargoVision extends TimedRobot {

    PhotonCamera camera = new PhotonCamera("photonvision");

    public void visionInit() {
        camera.setPipelineIndex(2);
    }

    public double getForwardValue() {
        double forwardValue = 0;
        var result = camera.getLatestResult();
        if (result.hasTargets()) {
            double range =
                    PhotonUtils.calculateDistanceToTargetMeters(
                            Constants.cameraHeightMeters,
                            Constants.targetHeightMeters,
                            Constants.cameraPitchRadians,
                            Units.degreesToRadians(result.getBestTarget().getPitch()));
            forwardValue = range;
        }
        return forwardValue;
    }

    public double getRotationValue() {
        double rotationValue = 0;
        var result = camera.getLatestResult();
        rotationValue = result.getBestTarget().getYaw();
        return rotationValue;
    }
}