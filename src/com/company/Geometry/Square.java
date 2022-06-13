package com.company.Geometry;
//Квадрат
public class Square {
    int a = 24;
    int Ps;
    int Ss;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getPs() {
        Ps = 4*a;
        return Ps;
    }

    public void setPs(int ps) {
        Ps = ps;
    }

    public int getSs() {
        Ss = a*a;
        return Ss;
    }

    public void setSs(int ss) {
        Ss = ss;
    }
}
