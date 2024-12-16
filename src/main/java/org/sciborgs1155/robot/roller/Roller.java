package org.sciborgs1155.robot.roller;

import org.sciborgs1155.robot.Robot;
import org.sciborgs1155.robot.roller.Roller;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class Roller {

    public static Roller create(){
        return new Roller(Robot.isReal() ? new RealRoller() : new SimRoller());
    }

    public static Roller none(){
        return new Roller(new NoRoller());
    }

    public Roller(RollerIO roller){

    }

    public Command intake(){
        return new InstantCommand();
    }

    public Command outtake(){
        return new InstantCommand();
    }

}
