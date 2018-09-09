package com.test.Database;

public class Vehicle {
    private String type;
    private int wheels;
    private int registrationNumber;
    private String model;
    private String make;

    public Vehicle(String type, int wheels, int registrationNumber, String make, String model) {
        this.type = type;
        this.wheels = wheels;
        this.model = model;
        this.make = make;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", wheels=" + wheels +
                ", registrationNumber=" + registrationNumber +
                ", model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
