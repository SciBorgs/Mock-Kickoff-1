package org.sciborgs1155.robot.wrist;

public interface WristIO extends AutoCloseable {

  public void setVoltage();

  public double getVelocity();

  public double getPosition();
}
