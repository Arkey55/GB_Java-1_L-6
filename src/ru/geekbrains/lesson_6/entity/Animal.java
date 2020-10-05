package ru.geekbrains.lesson_6.entity;

/**
 * Доступ к Animal только у потомков
 */
class Animal {

    String name;
    int runDistance;
    float jumpHeight;
    int swimDistance;

    Animal(String name, int runDistance, float jumpHeight, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    public void run (int runDistance){
        if (runDistance <= this.runDistance){
            System.out.println(name + " can run " + runDistance + " meters");
        } else {
            System.out.println(name + " can't run " + runDistance + " meters, only " + this.runDistance);
        }
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

    public void jumpOverObstacles (float jumpHeight){
        if (jumpHeight <= this.jumpHeight){
            System.out.println(name + " can jump for " + jumpHeight + " meters");
        } else {
            System.out.println(name + " can't jump for " + jumpHeight + " meters, only " + this.jumpHeight);
        }
    }
}
