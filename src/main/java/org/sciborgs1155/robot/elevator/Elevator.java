package org.sciborgs1155.robot.elevator;

/** Angled Elevator Subsystem */
public class Elevator {
    private final ElevatorIO hardware;

    public Elevator(ElevatorIO hardwareIO) {
        hardware = hardwareIO;
    }
}
