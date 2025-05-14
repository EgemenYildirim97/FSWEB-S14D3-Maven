package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize,int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders=cylinders;
    }


    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }
    public int getCylinders(){
        return cylinders;
    }
    @Override
    public void startEngine() {
        System.out.println("Hibrit sistem devreye giriyor...");
    }

    @Override
    public void drive() {
        System.out.println("Hem elektrikli hem de benzinli sürüş keyfi...");
        runEngine();
    }

    @Override
    protected void runEngine() {
        System.out.println("Hibrit motor gücü birleştiriyor.");
    }
}
