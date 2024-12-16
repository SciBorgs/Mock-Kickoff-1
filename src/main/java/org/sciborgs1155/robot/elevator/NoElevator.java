package org.sciborgs1155.robot.elevator;

public class NoElevator implements ElevatorIO {

    /**
     * Constructor
     */
    public NoElevator() {}

    @Override
    public double position() {
        return 0;
    }

    @Override
    public double velocity() {
        return 0;
    }

    @Override
    public void setVoltage() { }

    @Override
    public void close() {}
    
}
