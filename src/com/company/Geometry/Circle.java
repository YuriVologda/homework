package com.company.Geometry;

//Окружность
public class Circle {
    private int radius;
    private double pi = 3.14;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getSquare() {
        double square = radius * radius * pi;
        return square;
    }

    public double getPerimeter() {
        return 2 * pi * radius;
    }

    public void multiplyRadiusOnTwo() {
        int newRadius = radius * 2;
        setRadius(newRadius);
    }
}
