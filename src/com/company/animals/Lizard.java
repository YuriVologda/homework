package com.company.animals;

public class Lizard implements Animal {
    public String color;
    public String name;
    public char gender;
    boolean sleep;

    public Lizard(String color, String name, char gender) {
        this.color = color;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void move() {
        if (sleep) {
            System.out.println("Не может двигаться, так как спит, но готова проснуться и  сбежать от малейшего шороха");
        } else {
            sleep = false;
            System.out.println("Греется на теплом камешке, при появлении посетителей сразу же гасится в ближайшей щели");
        }

    }

    @Override
    public void eat() {
        if (sleep) {
            System.out.println("Животное не может принимать пищу, так как спит и видит сны о жирных мухах");
        } else {
            System.out.println(" Кушает жирную муху");
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
        return "Lizard{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
