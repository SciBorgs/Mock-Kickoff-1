package org.sciborgs1155.robot.elevator;

import edu.wpi.first.units.Distance;
import edu.wpi.first.units.Measure;
import edu.wpi.first.wpilibj2.command.Command;

/** Hardware interface for the angled elevator */
public interface ElevatorIO {
    /** Distance above the ground(not accounting for tilt) */
    public Command setPosition(Measure<Distance> position);
}
