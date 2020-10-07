package ru.geekbrains.lesson_6;

import ru.geekbrains.lesson_6.entity.Animal;
import ru.geekbrains.lesson_6.entity.Cat;
import ru.geekbrains.lesson_6.entity.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Chopper");
        Cat cat1 = new Cat("Chloe");
        Cat cat2 = new Cat("Marsh");

        Rabbit bunny = new Rabbit("Bugs");
        bunny.run(200);

        dog1.run(499);
        dog1.jumpOverObstacles(1);
        dog1.swim(7);
        cat1.run(200);
        cat2.jumpOverObstacles(2);
    }
}
