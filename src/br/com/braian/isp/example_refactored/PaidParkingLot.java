package br.com.braian.isp.example_refactored;

import br.com.braian.isp.Car;

public interface PaidParkingLot extends ParkingLot {

    double calculateFee(Car car); // Returns the price based on number of hours
    void doPayment(Car car);

}
