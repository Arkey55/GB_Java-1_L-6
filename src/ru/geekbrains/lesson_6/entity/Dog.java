package ru.geekbrains.lesson_6.entity;

import java.util.Random;

public class Dog extends Animal {

    public Dog(String name) {
        super(name,
                400 + new Random().nextInt(300),
                0.5f + new Random().nextInt(2),
                new Random().nextInt(20)
        );
    }
}
