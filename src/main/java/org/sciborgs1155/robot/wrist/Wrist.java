package org.sciborgs1155.robot.wrist;

import org.sciborgs1155.robot.Robot;

public class Wrist {

  public static Wrist create() {
    return new Wrist(Robot.isReal() ? new RealWrist() : new SimWrist());
  }

  public static Wrist none() {
    return new Wrist(new NoWrist());
  }

  public Wrist(WristIO wrist) {}
}
