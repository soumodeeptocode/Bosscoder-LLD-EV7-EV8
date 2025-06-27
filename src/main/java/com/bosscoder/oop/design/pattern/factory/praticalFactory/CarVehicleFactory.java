package com.bosscoder.oop.design.pattern.factory.praticalFactory;

public class CarVehicleFactory extends VehicleFactory {
    @Override
    protected Vehicle createVehicle() {
        return new Car();
    }
}
