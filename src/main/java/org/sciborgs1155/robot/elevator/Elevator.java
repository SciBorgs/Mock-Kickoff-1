package org.sciborgs1155.robot.elevator;

import edu.wpi.first.math.controller.ElevatorFeedforward;
import edu.wpi.first.math.controller.ProfiledPIDController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.Subsystem;

import static org.sciborgs1155.robot.elevator.ElevatorConstants.*;

import org.sciborgs1155.robot.Robot;

/** Angled Elevator Subsystem */
public class Elevator implements Subsystem {
    private final ElevatorIO hardware;
    private final ProfiledPIDController pidController;
    private final ElevatorFeedforward ffdController;

    public Elevator(ElevatorIO hardwareIO) {
        pidController = new ProfiledPIDController(PID_CONSTANTS.kP, PID_CONSTANTS.kI, PID_CONSTANTS.kD, CONSTRAINTS);
        ffdController = new ElevatorFeedforward(kS, kG, kV);
        hardware = hardwareIO;
    }

    /** Returns a new {@link Elevator} class depending on if it's real or not */
    public Elevator create() {
        if (Robot.isReal()) {
            return new Elevator(new RealElevator());
        }
        if (Robot.isSimulation()) {
            return new Elevator(new SimElevator());
        }

        return new Elevator(new NoElevator());
    }

    /** Moves to the specified height off the ground using PID and FFD */
    public Command setHeight(ElevatorPosition position) {
        pidController.calculate(hardware.position(), POSITION_MAP.get(position).in(Meters));
        return Commands.idle(this);
    }

}
