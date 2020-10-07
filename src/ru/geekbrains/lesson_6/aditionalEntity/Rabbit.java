package ru.geekbrains.lesson_6.aditionalEntity;

import ru.geekbrains.lesson_6.entity.Animal;

import java.util.Random;

public class Rabbit extends Animal {

    public Rabbit(String name) {

        super(name,
                100 + new Random().nextInt(200),
                1f + new Random().nextInt(2)
        );
    }
    public void eatCarrot(){
        System.out.println(name + "eating carrot");
    }
}
