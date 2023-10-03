package models;

public class Cat implements Animal {


    @Override
    public void move() {
        System.out.println("Moves graciously");
    }

    @Override
    public void eat() {
        System.out.println("Umnom nom nom");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps 80% of the time");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }
    public void name() {
        System.out.println("Kasper");
    }
}
