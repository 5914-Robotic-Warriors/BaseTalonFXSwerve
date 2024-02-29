package frc.robot.commands;

import java.util.function.Supplier;

import edu.wpi.first.wpilibj2.command.Command;

public class BallscrewToggle extends Command {

    private boolean ballscrewToggle = true;

    public BallscrewToggle() {
    }

    public boolean getBallscrewToggle(){
        return ballscrewToggle;
    }

    public void toggleBool(){
        ballscrewToggle = !ballscrewToggle;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        //ballscrewToggle = !ballscrewToggle;
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }

}
