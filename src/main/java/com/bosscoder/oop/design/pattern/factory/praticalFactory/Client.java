package com.bosscoder.oop.design.pattern.factory.praticalFactory;

public class Client {
    public static void main(String[] args) {
        CarVehicleFactory carVehicleFactory = new CarVehicleFactory();
        Vehicle vehicle = carVehicleFactory.buildVehicle();
        vehicle.build();

        MotorCycleVehcileFactory motorCycleVehcileFactory = new MotorCycleVehcileFactory();
        Vehicle motorCycleVehicle = motorCycleVehcileFactory.buildVehicle();
        motorCycleVehicle.build();
    }
}
