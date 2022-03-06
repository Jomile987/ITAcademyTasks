package com.itacademy.java.oop.basics.task2;

public class Speedometer {

    public static Bike chooseWinner(MountainBike mountainBike, RoadBike roadBike) {
        return chooseWinner(mountainBike.getSpeed(), roadBike.getSpeed());
    }

    public static Bike chooseWinner(int mountainBikeSpeed, int roadBikeSpeed) {
        if (mountainBikeSpeed > roadBikeSpeed) {
            return Bike.MOUNTAIN;
        } else if (mountainBikeSpeed < roadBikeSpeed) {
            return Bike.ROAD;
        } else {
            return Bike.DRAW;
        }

    }
}
