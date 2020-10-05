package ru.geekbrains.lesson_6.entity;

import java.util.Random;

public class Dog extends Animal {
    private int swimDistance = new Random().nextInt(20);

    public Dog(String name) {
        super(name,
                400 + new Random().nextInt(300),
                0.5f + new Random().nextInt(2)
        );
    }

    public void swim (int swimDistance){
        if (this.swimDistance < 1){
            System.out.println("Sorry, " + name + " can't swim");
        }
        else if (swimDistance <= this.swimDistance){
            System.out.println(name + " can swim " + swimDistance + " meters");
        } else {
            System.out.println(name + " can't swim " + swimDistance + " meters, only " + this.swimDistance);
        }
    }
}
