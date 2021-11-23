package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class Brrrrr extends CommandBase {
    private final Intake intake;

    public Brrrrr(Intake intake) {
        this.intake = intake;
        addRequirements(intake);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        intake.setPower(0.7);
    }

    @Override
    public void end(boolean interrupted) {
        intake.setPower(0);
    }

    @Override
    public boolean isFinished() {
        return super.isFinished();
    }
}
