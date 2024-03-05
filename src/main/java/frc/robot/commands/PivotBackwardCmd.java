package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
 import frc.robot.subsystems.IntakeSystem;
public class PivotBackwardCmd extends Command  {
    
    public IntakeSystem pivotSystem ;
    public PivotBackwardCmd(IntakeSystem b){
      pivotSystem = b;
    }
    
    @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    pivotSystem.setBackward();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    pivotSystem.stopMotor();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}