package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Ford engine ignites!");
        return "Ford engine ignites!";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Ford is moving faster.");
        return "Ford is moving faster.";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Ford comes to a halt.");
        return "Ford comes to a halt.";
    }
}