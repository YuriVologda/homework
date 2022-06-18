package com.company.Geometry;

//Прямоугольник
public class Rectangle {
    private int a = 70;
    private int b = 98;
    private int Sr;
    private int Pr;
    private int Lr;

    @Override
    public String toString() {
        return "Rectangle{" +
                "ширина :a=" + a +
                ", длина: b=" + b +
                ",площадь: Sr=" + Sr +
                ",периметр: Pr=" + Pr + ", удвоенная: " + Lr +
                '}';
    }

    public int getPr() {
        Pr = 2 * (a + b);
        return Pr;
    }

    public void setPr(int pr) {
        Pr = pr;

    }

    public int getLr() {
        a = a*2;
        b = b*2;
        return Lr;
    }

    public void setLr(int lr) {
        a = a*2;
        b = b*2;
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
        Sr = a * b;
        return Sr;
    }

    public void setSr(int sr) {
        Sr = sr;

    }
}

