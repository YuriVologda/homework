package com.company.Geometry;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        int Pr = rectangle.getPr();
        int Sr = rectangle.getSr();
        int Lr = rectangle.getLr();
        System.out.println(rectangle.toString());


        Square square = new Square(24);
        int Ps = square.getPerimeter();
        int Ss = square.getSquare();
        System.out.println(square.toString());


        Circle circle = new Circle(2);
        double Pc = circle.getSquare();
        double Sc = circle.getPerimeter();
        System.out.println(circle.toString());


        RightTriangle triangle = new RightTriangle(2, 3);
        int Pt = triangle.getPt();
        double St = triangle.getSt();
        System.out.println(triangle.toString());
    }
}
