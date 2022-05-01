package com.company.TaxiService;

public class Trip {
    Car car;
    Rout rout;
    Driver driver;
    int price;
    char symbolOfRouble = '₽';

    public Trip(/*rout rout, Car car, Driver driver*/) {
        /*this.rout = rout;
        this.car = car;
        this.driver = driver;*/
        //price = (int) rout.distance * 40;
        //price = (int) Math.round(rout.distance * 40);


    }

    public void printInfo() {
        price = (int) rout.distance * 40;
        rout.printInfo();
        System.out.println();
        System.out.println("На Ваш маршрут назначен автомобиль: ");
        car.printInfo();
        System.out.println();
        driver.printInfo();
        System.out.println();
        System.out.println("Цена поездки составит " + price + symbolOfRouble);
    }
}


