package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Ports;

import static frc.robot.Ports.Intake.*;//UwU

public class Intake extends SubsystemBase {
    private final TalonFX motor = new TalonFX(MOTOR_PORT);

    public Intake() {
        motor.setInverted(MOTOR_INVERTED);
    }

    public void setPower(double power) {
        motor.set(ControlMode.PercentOutput, power);
    }
}
