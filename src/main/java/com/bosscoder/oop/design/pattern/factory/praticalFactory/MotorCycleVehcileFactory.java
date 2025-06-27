package com.bosscoder.oop.design.pattern.factory.praticalFactory;

public class MotorCycleVehcileFactory extends VehicleFactory{
    @Override
    protected Vehicle createVehicle() {
        return new MotorCycle();
    }
}
