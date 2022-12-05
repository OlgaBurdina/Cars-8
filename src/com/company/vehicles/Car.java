package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String car_model;
    private String car_class;
    private double vehicle_weight;
    private Driver driver;
    private Engine engine;

    public Car(String car_model, String car_class, double vehicle_weight, Driver driver, Engine engine) {
        this.car_model = car_model;
        this.car_class = car_class;
        this.vehicle_weight = vehicle_weight;
        this.driver = driver;
        this.engine = engine;
    }
    public void StartCar () {
        System.out.println("Поехали!");
    }
    public void StopCar () {
        System.out.println("Останавливаемся!");
    }
    public void TurnRight() {
        System.out.println("Поворот направо!");
    }
    public void TurnLeft() {
        System.out.println("Поворот налево!");
    }
    @Override
    public String toString() {
        return "Информация об автомобиле: " + "\n" +
                "car_model = " + car_model + "\n" +
                "car_class = " + car_class + "\n" +
                "vehicle_weight = " + vehicle_weight + "\n" +
                engine.toString() + "\n" +
                driver.toString();
    }
}
