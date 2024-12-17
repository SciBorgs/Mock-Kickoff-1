package org.sciborgs1155.robot.roller;

import static org.sciborgs1155.robot.roller.RollerConstants.*;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import org.sciborgs1155.robot.Robot;

public class Roller {

  public static Roller create() {
    return new Roller(Robot.isReal() ? new RealRoller() : new SimRoller());
  }

  public static Roller none() {
    return new Roller(new NoRoller());
  }

  public Roller(RollerIO roller) {
    PIDController pid = new PIDController(kP, kI, kD);
  }

  public Command intake() {
    return new InstantCommand();
  }

  public Command outtake() {
    return new InstantCommand();
  }

  public Command setSpeed() {
    return new InstantCommand();
  }
}
