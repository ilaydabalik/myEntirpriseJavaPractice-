package edu.sabanciuniv.model;

import jakarta.persistence.Entity;

@Entity
public class Motorcycle extends Vehicle{

    private double enginePower;

    public Motorcycle(int year, String plate, double enginePower) {
        super(year, plate);
        this.enginePower = enginePower;
    }
    public Motorcycle(double enginePower) {
        this.enginePower = enginePower;
    }

    public Motorcycle(){}

    public double getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(double enginePower) {
        this.enginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "enginePower=" + enginePower +
                '}' + super.toString();
    }
}
