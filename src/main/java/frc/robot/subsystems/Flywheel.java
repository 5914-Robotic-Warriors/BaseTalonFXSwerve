package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Flywheel extends SubsystemBase {
    private final TalonFX flywheel1 = new TalonFX(0);
    private final TalonFX flywheel2 = new TalonFX(0);

    public Flywheel() {

    }
}
