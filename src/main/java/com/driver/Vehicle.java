package com.driver;


public class Vehicle
{
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public String getName() {
        return name;
    }

    public Vehicle(String name)
    {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }


    public int getCurrentSpeed()
    {
        return this.currentSpeed;
    }
    public int getCurrentDirection()
    {
        return this.currentDirection;
    }
    public void steer(int direction)
    {
        this.currentDirection = this.currentDirection+direction;
        //direction is in degrees, add it to the current direction
        System.out.println(("steer method called - The direction is changed to: " + currentDirection + " degrees"));
    }

    public void move(int speed, int direction)
    {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        //set the values of currentSpeed and currentDirection
        System.out.println(("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees"));
    }

    public void stop()
    {
        currentSpeed=0;
        System.out.println(("stop method called - The vehicle is stopped"));
    }

}
