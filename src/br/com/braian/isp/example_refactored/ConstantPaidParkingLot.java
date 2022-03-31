package br.com.braian.isp.example_refactored;

import br.com.braian.isp.Car;

public class ConstantPaidParkingLot implements PaidParkingLot{
    @Override
    public double calculateFee(Car car) {
        return 0;
    }

    @Override
    public void doPayment(Car car) {

    }

    @Override
    public void parkCar() {

    }

    @Override
    public void unparkCar() {

    }

    @Override
    public void getCapacity() {

    }
}
