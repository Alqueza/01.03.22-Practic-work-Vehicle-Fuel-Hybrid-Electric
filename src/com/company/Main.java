package com.company;

import com.company.Vehicles.Car;
import com.company.Vehicles.Truck;

import static com.company.TypeOfEngine.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vehicle car1 = new Car("Car Model 1", 2000, Fuel);
        Vehicle car2 = new Car("Car Model 2", 2001, Fuel);
        Vehicle car3 = new Car("Car Model 3", 2002, Hybrid);
        Vehicle car4 = new Car("Car Model 4", 2003, ElectroMobile);
        Vehicle car5 = new Car("Car Model 5", 2004, Fuel);
        Vehicle car6 = new Car("Car Model 6", 2005, Hybrid);
        Vehicle car7 = new Car("Car Model 7", 2006, Fuel);
        Vehicle car8 = new Car("Car Model 8", 2007, Hybrid);

        Vehicle truck1 = new Truck("Truck Model 1", 2012, Fuel);
        Vehicle truck2 = new Truck("Truck Model 2", 2012, Fuel);
        Vehicle truck3 = new Truck("Truck Model 3", 2013, Fuel);
        Vehicle truck4 = new Truck("Truck Model 4", 2014, ElectroMobile);
        Vehicle truck5 = new Truck("Truck Model 5", 2005, ElectroMobile);
        Vehicle truck6 = new Truck("Truck Model 6", 2006, ElectroMobile);
        Vehicle truck7 = new Truck("Truck Model 7", 2007, Fuel);

        Vehicle[] vehicles = {car1, truck1, car2, truck2,
                car3, truck3, car4, truck4,
                car5, truck5, car6, truck6,
                car7, truck7, car8};

        int quantityOfElectricVehicles = getQuantityOfElectricVehicles(vehicles);
        Vehicle[] electricVehicles = new Vehicle[quantityOfElectricVehicles];
        electricVehicles = getOnlyElectricVehicles(electricVehicles, vehicles);
        printElementsOfArray(electricVehicles);

        int quantityOfFuelVehicles = getQuantityOfFuelVehicles(vehicles);
        Vehicle[] fuelVehicles = new Vehicle[quantityOfFuelVehicles];
        fuelVehicles = getOnlyFuelVehicles(fuelVehicles,vehicles);
        printElementsOfArray(fuelVehicles);

        int quantityOfHybridVehicles = getQuantityOfHybridVehicles(vehicles);
        Vehicle[] hybridVehicles = new Vehicle[quantityOfHybridVehicles];
        hybridVehicles = getOnlyHybridVehicles(hybridVehicles, vehicles);
        printElementsOfArray(hybridVehicles);


    }
    private static Vehicle[] getOnlyElectricVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ElectroMobile)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    private static int getQuantityOfElectricVehicles(Vehicle[] vehicles) {
        int electricVehicleCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(ElectroMobile)) {
                electricVehicleCounter++;
            }
        }
        return electricVehicleCounter;
    }

    private static Vehicle[] getOnlyFuelVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(Fuel)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    private static int getQuantityOfFuelVehicles(Vehicle[] vehicles) {
        int FuelVehicleCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(Fuel)) {
                FuelVehicleCounter++;
            }
        }
        return FuelVehicleCounter;
    }

    private static void printElementsOfArray(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }

    private static Vehicle[] getOnlyHybridVehicles(Vehicle[] newEmptyArray, Vehicle[] vehicles) {
        int counterForNewEmptyArray = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(Hybrid)) {
                newEmptyArray[counterForNewEmptyArray] = vehicle;
                counterForNewEmptyArray++;
            }
        }
        return newEmptyArray;
    }

    private static int getQuantityOfHybridVehicles(Vehicle[] vehicles) {
        int electricVehicleCounter = 0;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfEngine().equals(Hybrid)) {
                electricVehicleCounter++;
            }
        }
        return electricVehicleCounter;
    }
    }