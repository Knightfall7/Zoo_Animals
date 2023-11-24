package org.example;
public class Mammal extends Animal {
    private final String furColor;

    public Mammal(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Mammal sound");
    }
}

// Additional methods or attributes specific to mammals