package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Conveyor extends SubsystemBase {
    private final TalonFX conveyor1 = new TalonFX(0);
    private final TalonFX conveyor2 = new TalonFX(0);

    public Conveyor() {

    }
}
