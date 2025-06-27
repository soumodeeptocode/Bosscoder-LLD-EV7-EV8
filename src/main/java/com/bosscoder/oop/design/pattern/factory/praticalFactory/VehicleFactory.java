package com.bosscoder.oop.design.pattern.factory.praticalFactory;

public abstract class VehicleFactory {

    public Vehicle buildVehicle(){
        Vehicle vehicle = createVehicle();
        vehicle.build();
        return vehicle;
    }

    protected abstract Vehicle createVehicle();
}
