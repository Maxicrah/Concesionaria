/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maxi.cardealership.Logic;

import com.maxi.cardealership.persistence.ControllerPersistence;
import java.util.List;

/**
 *
 * @author maxim
 */
public class Controller {

    ControllerPersistence controlPersis = new ControllerPersistence();
    
     public void saveData(String model, String brand, String motor, String color, String patent, int numDoors) {
         Car car = new Car();
         car.setModel(model);
         car.setBrand(brand);
         car.setMotor(motor);
         car.setColor(color);
         car.setPatent(patent);
         car.setNumDoors(numDoors);
        controlPersis.addCar(car);
    }

    public List<Car> traerAutos() {
        
       return controlPersis.traerAutos();
    }

    public void deleteCar(int idAuto) {
        
        controlPersis.deleteCar(idAuto);
    }

  
    
}
