package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    private final TalonFX intake1 = new TalonFX(0);
    private final TalonFX intake2 = new TalonFX(0);

    public Intake() {

    }
}
