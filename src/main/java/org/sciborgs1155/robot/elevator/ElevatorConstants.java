package org.sciborgs1155.robot.elevator;

import java.util.Map;

import com.pathplanner.lib.util.PIDConstants;

import edu.wpi.first.math.trajectory.TrapezoidProfile.Constraints;
import edu.wpi.first.units.Distance;
import edu.wpi.first.units.Measure;

public class ElevatorConstants {
    public static final PIDConstants PID_CONSTANTS = new PIDConstants(1, 0, 0);
    public static final Constraints CONSTRAINTS = new Constraints(5, 0.1);

    public static final double kS = 0;
    public static final double kG = -9.8;
    public static final double kV = 1;

    /**
     * Position in meters above base, height in meters above ground(elevator is
     * angled)
     */
    public static final double POSITION_TO_HEIGHT = 1;

    /** Positions specified in map */
    public enum ElevatorPosition {
        SMALL_GOAL_POSITION,
        CENTER_GOAL_POSITION,
        HIGH_GOAL_POSITION,
        BUTTON_POSITION,
    }
    
    public static Map<ElevatorPosition,Measure<Distance>> POSITION_MAP;
}
