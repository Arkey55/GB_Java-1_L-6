package ru.geekbrains.lesson_6;

import ru.geekbrains.lesson_6.entity.Cat;
import ru.geekbrains.lesson_6.entity.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Chopper");
        Cat cat1 = new Cat("Chloe");
        Cat cat2 = new Cat("Marsh");
        dog1.run(499);
        dog1.swim(7);
        cat1.swim(1);
        cat2.jumpOverObstacles(2);
    }
}
