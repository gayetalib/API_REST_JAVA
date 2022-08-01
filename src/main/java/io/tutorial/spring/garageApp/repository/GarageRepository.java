package io.tutorial.spring.garageApp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.tutorial.spring.garageApp.model.Car;

@Repository
public interface GarageRepository extends CrudRepository<Car, Long> {

}
