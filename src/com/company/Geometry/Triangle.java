package com.company.Geometry;
//Треугольник
public class Triangle {
    int a = 12;
    int b = 7;
    int c = 8;
    double h = 4.48;
    int Pt;
    double St;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public int getPt() {
        Pt = a+b+c;
        return Pt;
    }

    public void setPt(int pt) {
        Pt = pt;
    }

    public double getSt() {
        St = St = 0.5*a*h;
        return St;
    }

    public void setSt(double st) {
        St = st;
    }
}
