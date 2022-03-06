package com.itacademy.java.oop.basics.task2;

public class RoadBike implements Bicycle {
    private int gear;
    private int speed;

    public RoadBike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void changeGear(int newGear) {
        if (newGear == 1 || newGear == 2 || newGear == -1 || newGear == -2) {
            this.gear = gear + newGear;
            if (gear < 0 || gear > 10) {
                System.out.println("Gear is over 10 or below 0.");
            } else {
                System.out.println("Now gear is " + gear);
            }
        } else {
            System.out.println("Please use 1, 2, -1, 1 for gear change.");
        }
    }

    @Override
    public void speedUp(int increment) {
        if (increment <= 0) {
            System.out.println("Speed up is negative number, please use only possitive numbers.");
        } else {
            this.speed = speed + increment;
            if (speed > 50) {
                this.speed = speed - increment;
                System.out.println("Speed is too high. Highest speed can be 50.");
            } else {
                System.out.println("Now speed is " + speed);
            }
        }
    }

    @Override
    public void applyBrakes(int stop) {
        if (stop <= 0) {
            this.speed = speed + stop;
            if (speed < 0) {
                this.speed = speed - stop;
                System.out.println("Value is too high. The lowest possible speed can be 0.");
            } else {
                System.out.println("Now speed is " + speed);
            }
        } else {
            System.out.println("Braking value cannot be positive number, please use negative number.");
        }
    }
}
