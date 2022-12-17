package com.driver;


public class Vehicle
{
    public String name;
    public int currentSpeed;
    public int currentDirection;
    public java.lang.Object System;


    public Vehicle(String name)
    {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public Vehicle() {

    }


    public String steer(int direction)
    {
        this.currentDirection = this.currentDirection+direction;
        //direction is in degrees, add it to the current direction
        return ("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public String move(int speed, int direction)
    {
        this.currentSpeed = speed;
        this.currentDirection = direction;
        //set the values of currentSpeed and currentDirection
        return ("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public String stop()
    {
        this.currentSpeed=0;
        return ("stop method called - The vehicle is stopped");
    }

}
