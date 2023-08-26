/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.cardealership.persistence;

import com.maxi.cardealership.Logic.Car;
import com.maxi.cardealership.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maxim
 */
public class ControllerPersistence {
   
    CarJpaController carJpa = new CarJpaController();
    
    public void addCar(Car car) {
        carJpa.create(car);
    }

    public List<Car> traerAutos() {
       return carJpa.findCarEntities();
    }

    public void deleteCar(int idAuto) {
        
        try {
            carJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Car traerAuto(int idAuto) {
        return carJpa.findCar(idAuto);
    }

    public void modificarAuto(Car cars) {
        try {
            carJpa.edit(cars);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
