package org.sciborgs1155.robot.roller;

public interface RollerIO extends AutoCloseable {
  void setPower();

  boolean hasTetra();
}