package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class SportCar extends Car{
    private double max_speed;

    public SportCar(String car_model, String car_class, double vehicle_weight, Driver driver, Engine motor, double max_speed) {
        super(car_model, car_class, vehicle_weight, driver, motor);
        this.max_speed = max_speed;
    }

    public double getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +
                "max_speed - " + max_speed;
    }

}
