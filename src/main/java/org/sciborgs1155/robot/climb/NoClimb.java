package org.sciborgs1155.robot.climb;
class NoClimb implements ClimbIO{
    @Override
    public void motorVoltage(double Volts) {}
    @Override
    public double climbHeight(double Meters) {
       return 0;
    }
}