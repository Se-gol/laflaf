package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.CommandBase; //UwU
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drivetrain;

public class Brrrrrrrrrrrrrrrrrrrr extends CommandBase {
    private final Drivetrain drivetrain;
    private final XboxController xboxController = RobotContainer.xboxController;

    public Brrrrrrrrrrrrrrrrrrrr(Drivetrain drivetrain) {
        this.drivetrain = drivetrain;
        addRequirements(drivetrain);
    }

    @Override
    public void initialize() {
        super.initialize();
    }

    @Override
    public void execute() {
        double left = xboxController.getY(GenericHID.Hand.kLeft);
        double right = xboxController.getY(GenericHID.Hand.kRight);
        if (Math.abs(left) < 0.1)
            left = 0;
        if (Math.abs(right) < 0.1)
            right = 0;
        drivetrain.setPowerRight(right);
        drivetrain.setPowerLeft(left);
    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.setPowerRight(0);
        drivetrain.setPowerLeft(0);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
