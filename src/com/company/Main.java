package com.company;

import com.company.TaxiService.Car;
import com.company.TaxiService.Driver;
import com.company.TaxiService.Rout;
import com.company.TaxiService.Trip;
import com.company.animals.Elephant;
import com.company.animals.Lizard;
import com.company.animals.Parrot;
import com.company.animals.Tiger;


public class Main {

    public static void main(String[] args) {
        Elephant serega = new Elephant('M', "Сережка", "Серый");
        serega.sleep();
        serega.wakeUp();
        serega.move();
        serega.eat();
        serega.sleep();
        serega.move();
        serega.eat();
        System.out.println();
        System.out.println(serega);
        System.out.println();
        System.out.println();

        Lizard coward = new Lizard("Зеленая", "Трусиха", 'Ж');
        coward.sleep();
        coward.wakeUp();
        coward.move();
        coward.eat();
        coward.sleep();
        coward.move();
        coward.eat();
        System.out.println();
        System.out.println(coward);
        System.out.println();
        System.out.println();

        Parrot kesha = new Parrot("Трикрлор", "Кеша", 'М');
        kesha.sleep();
        kesha.wakeUp();
        kesha.move();
        kesha.eat();
        kesha.sleep();
        kesha.move();
        kesha.eat();
        System.out.println();
        System.out.println(kesha);
        System.out.println();
        System.out.println();

        Tiger yulia = new Tiger("Белая в темную полосу", "Юлечка", 'Ж');
        yulia.sleep();
        yulia.wakeUp();
        yulia.move();
        yulia.eat();
        yulia.sleep();
        yulia.move();
        yulia.eat();
        System.out.println();
        System.out.println(yulia);

    }
}
