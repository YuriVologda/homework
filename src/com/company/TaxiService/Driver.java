package com.company.TaxiService;

public class Driver {
    String name;
    double rating;
    char symbolOfStar = '★';


    public Driver(/*String name, double rating*/) {
       /* this.name = name;
        this.rating = rating;*/
    }


    public void printInfo() {
        System.out.println("Водитель: " + name + "(" + symbolOfStar + "" + rating + ")");
    }
}
