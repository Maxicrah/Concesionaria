/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.cardealership.Logic;

/**
 *
 * @author Maxii
 */
public class Car {
    
    private int id;
    private String model;
    private String brand;
    private String motor;
    private String color;
    private String patent;
    private int numDoors;

    public Car() {
    }

    public Car(int id, String model, String brand, String motor, String color, String patent, int numDoors) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.motor = motor;
        this.color = color;
        this.patent = patent;
        this.numDoors = numDoors;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String toString() {
        return "Car{" + "id=" + id + ", model=" + model + ", brand=" + brand + ", motor=" + motor + ", color=" + color + ", patent=" + patent + ", numDoors=" + numDoors + '}';
    }
    
    
    
}
