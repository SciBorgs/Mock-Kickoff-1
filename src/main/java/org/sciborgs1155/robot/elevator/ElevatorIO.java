package org.sciborgs1155.robot.elevator;

/** Hardware interface for the angled elevator */
public interface ElevatorIO {
    public double position();

    public double velocity();

    public void setVoltage();

}
