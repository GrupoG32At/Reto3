package com.usa.reto3.controller;

import com.usa.reto3.entity.CarEntity;
import com.usa.reto3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/all")
    public List<CarEntity> getAllCar(){
        return carService.getAllCar();
    }
    @PostMapping("/save")
    public CarEntity saveCar(@RequestBody CarEntity carEntity){
        return carService.saveCar(carEntity);
    }
    @DeleteMapping("/delete")
    public void deleteCar(@RequestParam int id){
        carService.deleteCar(id);
    }
    @PutMapping("/update")
    public CarEntity updateCar(@RequestBody CarEntity carEntity){
        return carService.updateCar(carEntity);
    }
}
