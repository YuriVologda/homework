package com.company.Geometry;

//Квадрат
public class Square {

    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + size +
                '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPerimeter() {
        int perimeter = 4 * size;
        return perimeter;
    }

    public int getSquare() {
        int square = size * size;
        return square;
    }

    public void multiply(int coefficient) {
        int newSize = size * coefficient;
        setSize(newSize);
    }

    public Square multiplyOnTwo() {
        int newSize = size * 2;
        Square square = new Square(newSize);
        return square;
    }
}
