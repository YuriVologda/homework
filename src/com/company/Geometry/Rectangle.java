package com.company.Geometry;

//Прямоугольник
public class Rectangle {
    int a = 70;
    int b = 98;
    int Sr = a * b;
    int Pr = 2 * (a + b);
    int Lr = (2*a) + (2*b);

    public int getPr() {
        return Pr;
    }

    public void setPr(int pr) {
        Pr = pr;
    }

    public int getLr() {
        return Lr;
    }

    public void setLr(int lr) {
        Lr = lr;
    }

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

    public int getSr() {
        return Sr;
    }

    public void setSr(int sr) {
        Sr = sr;
    }
}

