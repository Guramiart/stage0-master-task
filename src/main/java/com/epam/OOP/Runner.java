package com.epam.OOP;

public class Runner {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());

    }
}
