package org.sciborgs1155.robot.wrist;

import static org.sciborgs1155.robot.wrist.WristConstants.*;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import org.sciborgs1155.robot.Robot;

public class Wrist {

  public static Wrist create() {
    return new Wrist(Robot.isReal() ? new RealWrist() : new SimWrist());
  }

  public static Wrist none() {
    return new Wrist(new NoWrist());
  }

  public Wrist(WristIO wrist) {
    PIDController pid = new PIDController(kP, kI, kD);
  }

  public Command pointOut() {
    return new InstantCommand();
  }

  public Command PointIn() {
    return new InstantCommand();
  }
}
