package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;

    public boolean isManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    private boolean isManual;

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
    }

    public void changeGear(int newGear){
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        setCurrentSpeed(newSpeed);
        setCurrentDirection(newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
