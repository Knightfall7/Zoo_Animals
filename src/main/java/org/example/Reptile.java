package org.example;

public class Reptile extends Animal {
    private final boolean isColdBlooded;

    public Reptile(String name, int age, boolean isColdBlooded) {
        super(name, age);
        this.isColdBlooded = isColdBlooded;
    }

    public boolean isColdBlooded() {
        return isColdBlooded;
    }

    @Override
    public void makeSound() {
        System.out.println("Reptile sound");
    }

    // Additional methods or attributes specific to reptiles
}