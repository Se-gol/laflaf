package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Ports.Drivetrain.*;

public class Drivetrain extends SubsystemBase {
    private final TalonFX motor1 = new TalonFX(MOTOR1_PORT);
    private final TalonFX motor2 = new TalonFX(MOTOR2_PORT);
    private final TalonFX motor3 = new TalonFX(MOTOR3_PORT);
    private final TalonFX motor4 = new TalonFX(MOTOR4_PORT);

    public Drivetrain() {
        motor1.setInverted(MOTOR1_INVERTED);
        motor2.setInverted(MOTOR2_INVERTED);
        motor3.setInverted(MOTOR3_INVERTED);
        motor4.setInverted(MOTOR4_INVERTED);
    }

    public void setPowerRight(double power) {
        motor1.set(ControlMode.PercentOutput, power);
        motor3.set(ControlMode.PercentOutput, power);
    }
    public void setPowerLeft(double power) {
        motor2.set(ControlMode.PercentOutput, power);
        motor4.set(ControlMode.PercentOutput, power);
    }
}
