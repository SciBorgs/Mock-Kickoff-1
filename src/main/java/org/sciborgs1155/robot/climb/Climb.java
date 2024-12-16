// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.
package org.sciborgs1155.robot.climb;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
public class Climb extends SubsystemBase {
  /** Creates a new Climb. */
  private ClimbIO hardware;
  public Climb(ClimbIO hardware) {
    this.hardware = hardware;
  }
  // public static Climb create(){
  //   return Robot.isReal() ? new Climb(new RealClimb()) : new Climb(new SimClimb());
  // }
  // public static  None() {
  //   return new Climb(new NoClimb());
  // }
  public Command climbUp() {
    //TODO method body
  }
  public Command climbDown() {
    //TODO method body
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}