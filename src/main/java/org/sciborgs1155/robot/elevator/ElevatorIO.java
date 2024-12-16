package org.sciborgs1155.robot.elevator;

import monologue.Logged;

/** Hardware interface for the angled elevator */
public interface ElevatorIO extends AutoCloseable, Logged {
    
    /**
     * @return The position, in meters, of the angled elevator's height. 
     * (height means the distance along the rail from the base, not vertical height)
     */
    public double position();

    /**
     * @return The velocity, in meters per second, of the angled elevator.
     */
    public double velocity();

    /**
     * Sets the voltage of the elevator motors.
     */
    public void setVoltage();

}
