package com.leetcode.oops;

abstract class Animal {
    String name;

    // Constructor in Abstract Class
    Animal(String name) {
        this.name = name;
        System.out.println("Animal Constructor Called");
    }

    abstract void makeSound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);  // Calling the abstract class constructor
        System.out.println("Dog Constructor Called");
    }

    void makeSound() {
        System.out.println(name + " barks!");
    }
}

public class N_1AbstractClassConstructor {
    public static void main(String[] args) {
        Dog d = new Dog("Buddy"); // Creating a subclass object
        d.makeSound();
    }
}
