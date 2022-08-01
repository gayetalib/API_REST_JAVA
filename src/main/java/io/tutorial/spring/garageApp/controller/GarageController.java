package io.tutorial.spring.garageApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.tutorial.spring.garageApp.model.Car;
import io.tutorial.spring.garageApp.service.GarageService;

@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;

    @RequestMapping(method = RequestMethod.GET, value = "/cars")
    public List<Car> getCars() {
        return garageService.getCars();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/car/{id}")
    public Car getCar(@PathVariable long id) {
        return garageService.getCar(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable long id) {
        garageService.deleteCar(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cars")
    public void addCar(@RequestBody Car car) {
        garageService.addCar(car);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void updateCar(@RequestBody Car car, @PathVariable long id) {
        garageService.updateCar(car, id);
    }

}
