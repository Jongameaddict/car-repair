package com.techelevator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Car {

    @JsonIgnore
    private int carId;
    private String make;
    private String model;
    private int year;
    private String color;
    private String description;

    public Car(int carId, String make, String model, int year, String color, String description) {
        this.carId = carId;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.description = description;
    }

    public Car(){}

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}