/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.cardealership.persistence;

import com.maxi.cardealership.Logic.Car;

/**
 *
 * @author maxim
 */
public class ControllerPersistence {
   
    CarJpaController carJpa = new CarJpaController();
    
    public void addCar(Car car) {
        carJpa.create(car);
    }
    
}
