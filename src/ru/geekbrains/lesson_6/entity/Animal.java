package ru.geekbrains.lesson_6.entity;

public abstract class Animal {

    protected String name;
    private int runDistance;
    private float jumpHeight;

    protected Animal(String name, int runDistance, float jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run (int runDistance){
        if (runDistance <= this.runDistance){
            System.out.println(name + " can run " + runDistance + " meters");
        } else {
            System.out.println(name + " can't run " + runDistance + " meters, only " + this.runDistance);
        }
    }

    public void jumpOverObstacles (float jumpHeight){
        if (jumpHeight <= this.jumpHeight){
            System.out.println(name + " can jump for " + jumpHeight + " meters");
        } else {
            System.out.println(name + " can't jump for " + jumpHeight + " meters, only " + this.jumpHeight);
        }
    }
}
