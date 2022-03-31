package br.com.braian.isp.example;

import br.com.braian.isp.Car;

public class FreeParkingLot implements ParkingLot {

    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }

    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) {
        throw new RuntimeException("Parking lot is free");
    }
}