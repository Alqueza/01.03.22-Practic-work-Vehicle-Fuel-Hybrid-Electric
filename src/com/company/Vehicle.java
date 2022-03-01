package com.company;

import com.Exeptions.InvalidYearOfIssue;

import java.text.BreakIterator;
import java.time.LocalDate;
import java.time.Year;

public abstract class Vehicle {
    private String model;
    private int yaerOfIssure;
    private TypeOfEngine typeOfEngine;

    public Vehicle() {

    }

    public Vehicle(String model, int yaerOfIssure, TypeOfEngine typeOfEngine) {
        this.model = model;
        this.yaerOfIssure = checkYearOfIssue(yaerOfIssure);
        this.typeOfEngine = typeOfEngine;
    }

    private int checkYearOfIssue(int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        try {
            if (yearOfIssue > currentYear ||
                    yearOfIssue < currentYear - 100) {
                throw new InvalidYearOfIssue(this.model + " have invalid year of issue [" + yearOfIssue + "]");
            }
            return yearOfIssue;
        } catch (InvalidYearOfIssue exception) {
            System.err.println(exception.getMessage());
            return currentYear;
        }
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYaerOfIssure() {
        return yaerOfIssure;
    }

    public void setYaerOfIssure(int yaerOfIssure) {
        this.yaerOfIssure = yaerOfIssure;
    }

    public TypeOfEngine getTypeOfEngine() {
        return typeOfEngine;
    }

    public void setTypeOfEngine(TypeOfEngine typeOfEngine) {
        this.typeOfEngine = typeOfEngine;
    }

    public void drive(){
        System.out.println(model+" drive");
    }

//    public void YearOfIssure(){
//        if (yaerOfIssure > 2022){
//            System.err.println(model+" IVALID ISSUE YEAR");
//        }else {
//            System.out.println("year of issue: "+yaerOfIssure);
//        }
//    }

    @Override
    public String toString() {
        return "\nVehicle" +
                "\nmodel: " + model +
                "\nyaer Of Issure: " + yaerOfIssure +
                "\ntype Of Engine: " + typeOfEngine;
    }
}
