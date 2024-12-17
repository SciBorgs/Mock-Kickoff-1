package org.sciborgs1155.robot.wrist;

public class NoWrist implements WristIO {
  @Override
  public void close() throws Exception {}

  @Override
  public void setVoltage() {}

  @Override
  public double getVelocity() {
    return 0;
  }

  @Override
  public double getPosition() {
    return 0;
  }
}
