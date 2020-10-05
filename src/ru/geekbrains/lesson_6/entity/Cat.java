package ru.geekbrains.lesson_6.entity;

import java.util.Random;

public class Cat extends Animal {

    public Cat(String name) {
        super(name,
                100 + new Random().nextInt(200),
                1f + new Random().nextInt(2),
                0
        );
    }
}
