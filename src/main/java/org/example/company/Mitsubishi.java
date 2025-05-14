package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi engine starting - Vroom!");
        return "Mitsubishi engine starting - Vroom!";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi is speeding up!");
        return "Mitsubishi is speeding up!";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + ": Mitsubishi slowing down smoothly.");
        return "Mitsubishi slowing down smoothly.";
    }
}