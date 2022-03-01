package com.company.Vehicles;

import com.company.TypeOfEngine;
import com.company.Vehicle;

public class Truck extends Vehicle {

    public Truck() {
    }

    public Truck(String model, int yaerOfIssure, TypeOfEngine typeOfEngine) {
        super(model, yaerOfIssure, typeOfEngine);
    }

    @Override
    public void drive() {
        System.out.println(getModel()+" we driving");
    }
}
