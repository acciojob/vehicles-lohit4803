package com.driver;

public class Car extends Vehicle
{
    public int wheels;
    public String type;
    public int doors;
    public int gears;
    public boolean isManual;
    public int currentGear;
    public int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats)
    {
        super();
        //Hint: Car extends Vehicle
        this.currentGear=1;
        this.wheels=wheels;
        this.type=type;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.seats=seats;
    }

    public Car() {

    }

    public void changeGear(int newGear)
    {
        this.currentGear=newGear;
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection)
    {
        move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
