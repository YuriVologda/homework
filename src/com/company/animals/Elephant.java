package com.company.animals;

public class Elephant implements Animal {
    public String color;
    public String name;
   public char gender;
    boolean sleep;


    public Elephant(char gender, String name, String color) {
        this.gender = gender;
        this.name = name;
        this.color = color;
    }

    @Override
    public void move() {
        if (sleep) {
            System.out.println("Бедняга устал и спит, поэтому не может двигаться, чтобы разбудить нужно сильно постараться");
        } else {
            sleep = false;
            System.out.println("Ходит по территории, изредка, вероятно от скуки изредка ворочает бревна");
        }

    }

    @Override
    public void eat() {
        if (sleep) {
            System.out.println("Громко бурчит живот во сне");
        } else {
            System.out.println("По традициям веганов, кушает сочную травку");
        }

    }

    @Override
    public void sleep() {
        sleep = true;

        System.out.println("Спит");

    }

    @Override
    public String toString() {
        return "Elephant{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }

    @Override
    public void wakeUp() {
        sleep = false;


    }


}

