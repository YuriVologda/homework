package com.company.animals;

public class Tiger implements Animal {
    public String color;
    public String name;
    public char gender;
    boolean sleep;

    public Tiger(String color, String name, char gender) {
        this.color = color;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void move() {
        if (sleep) {
            System.out.println("Животное не может двигаться, так как спит");
        } else {
            sleep = false;
            System.out.println("Либо лежит на ветке крупного дерева и с аппетитом поглядывает на окружающих, либо пугает всех вокруг бросаясь на стекло лапами и рыча");
        }

    }

    @Override
    public void eat() {
        if (sleep) {
            System.out.println("Животное не может принимать пищу так как спит после сытного обеда из нежной охранятины");
        } else {
            System.out.println("Ест мяско и сыто поглядывает на охрану и посетителей ");
        }

    }

    @Override
    public void sleep() {
        sleep = true;

        System.out.println("Спит");

    }

    @Override
    public void wakeUp() {
        sleep = false;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
