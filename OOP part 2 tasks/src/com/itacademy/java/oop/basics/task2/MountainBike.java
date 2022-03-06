package com.itacademy.java.oop.basics.task2;

public class MountainBike implements Bicycle {
    private int gear;
    private int speed;

    public MountainBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear == 1 || newGear == -1) {
            this.gear = gear + newGear;
            if (gear < 0 || gear > 20) {
                System.out.println("Gear is over 20 or below 0");
            } else {
                System.out.println("Now gear is " + gear);
            }
        } else {
            System.out.println("Please use 1 or -1 for gear change.");
        }

    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Speed up is negative number, please use only possitive numbers.");
        } else {
            this.speed = speed + increment;
            if (speed > 100) {
                this.speed = speed - increment;
                System.out.println("Speed is too high. Highest speed can be 100");
            }else{
                System.out.println("Now speed is " + speed);
            }
        }
    }

    @Override
    public void applyBrakes(int stop) {
        if (stop >= 0) {
            this.speed = speed - stop;
            if (speed < -10) {
                this.speed = speed + stop;
                System.out.println("Value is too high. The highest possible value to break is -10");

            } else {
                System.out.println("Now speed is " + speed);
            }
        } else {
            System.out.println("Braking value cannot be negative number, please use positive number");
        }
    }
}
