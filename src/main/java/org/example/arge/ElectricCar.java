package org.example.arge;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterSize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterSize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterSize = batterSize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterSize;
    }
    @Override
    public void startEngine() {
        System.out.println("Elektrik motoru sessizce hazır.");
    }

    @Override
    public void drive() {
        System.out.println("Sessiz ve çevreci bir yolculuk...");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Elektrik motoru enerjiyi sağlıyor.");
    }


}
