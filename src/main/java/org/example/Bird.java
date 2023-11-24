package org.example;
public class Bird extends Animal {
    private final boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    public boolean canFly() {
        return canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Bird sound");
    }

    // Additional methods or attributes specific to birds
}