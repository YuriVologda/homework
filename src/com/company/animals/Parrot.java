package com.company.animals;

public class Parrot implements Animal {
    public String color;
    public String name;
    public char gender;
    boolean sleep;

    public Parrot(String color, String name, char gender) {
        this.color = color;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void move() {
        if (sleep) {
            System.out.println("Не может двигаться так как спит, еще и утробно храпит");
        } else {
            sleep = false;
            System.out.println("Либо сидит на ветке и громко матероится, либо летает и метко гадит на посетителей");
        }

    }

    @Override
    public void eat() {
        if (sleep) {
            System.out.println("Не может принимать пищу, так как спит и гроомко пускает газы");
        } else {
            System.out.println("Щелкает семки");
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
        return "Parrot{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
