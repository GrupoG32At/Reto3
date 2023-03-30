package com.usa.reto3.service;

import com.usa.reto3.entity.CarEntity;
import com.usa.reto3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    @Autowired
    CarRepository carRepository;

    public void deleteCar(int id){
        carRepository.deleteById(id);
    }

    public CarEntity updateCar(CarEntity carEntity){
        if(carRepository.existsById(carEntity.getID())){
            return carRepository.save(carEntity);
        }else{
            return null;
        }
    }

    public List<CarEntity> getAllCar(){
        return carRepository.findAll();
    }

    public CarEntity saveCar(CarEntity carEntity){
        if(carRepository.existsById(carEntity.getID())){
            return null;
        }else{
            return carRepository.save(carEntity);
        }
    }
}
