package com.company.Geometry;
//Окружность
public class Circle {
    int r = 21;
    double Sc;
    double Pc;

    public double getSc() {
        Sc = (r*r) * 3.14;
        return Sc;
    }

    public void setSc(double sc) {
        Sc = sc;
    }

    public double getPc() {
        Pc = 2*3.14*r;
        return Pc;
    }

    public void setPc(double pc) {
        Pc = pc;
    }
}
