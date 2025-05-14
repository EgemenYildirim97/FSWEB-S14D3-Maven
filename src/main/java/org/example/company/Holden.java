package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Holden roars to life!");
        return "Holden roars to life!";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Holden is picking up pace.");
        return "Holden is picking up pace.";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Holden applies the brakes.");
        return "Holden applies the brakes.";
    }
}