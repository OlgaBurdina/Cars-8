package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Lorry extends Car{
    private double load_capacity;


    public Lorry(String car_model, String car_class, double vehicle_weight, Driver driver, Engine motor, double load_capacity) {
        super(car_model, car_class, vehicle_weight, driver, motor);
        this.load_capacity = load_capacity;
    }

    public double getLoad_capacity() {
        return load_capacity;
    }

    public void setLoad_capacity(double load_capacity) {
        this.load_capacity = load_capacity;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "load_capacity - " + load_capacity;
    }
}
