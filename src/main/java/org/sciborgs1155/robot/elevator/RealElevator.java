package org.sciborgs1155.robot.elevator;

import org.sciborgs1155.robot.Ports.Elevator;

import com.ctre.phoenix6.hardware.TalonFX;

public class RealElevator implements ElevatorIO {

    TalonFX lead, follow;

    /**
     * Constructor
     */
    public RealElevator() {
        lead = new TalonFX(Elevator.ELEVATOR_LEAD);
        follow = new TalonFX(Elevator.ELEVATOR_FOLLOW);
    }

    @Override
    public double position() {
        return lead.getPosition().getValueAsDouble();
        //TODO this returns in rotations, not in meters
    }

    @Override
    public double velocity() {
        return lead.getVelocity().getValueAsDouble();
        //TODO this returns in rotations per second, not in meters per second
    }

    @Override
    public void setVoltage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setVoltage'");
    }

    @Override
    public void close() throws Exception {
        lead.close();
        follow.close();
    }
    
}
