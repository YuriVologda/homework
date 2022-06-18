package com.company.Geometry;

//Треугольник
public class RightTriangle {
    double a;
    double b;
    double c;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getSquare() {
        return a * b * 0.5;
    }
}
