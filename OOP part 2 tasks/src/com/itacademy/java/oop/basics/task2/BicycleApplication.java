package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        Bicycle bikeMountain = new MountainBike(1, 2);
        Bicycle bikeRoad = new RoadBike(9, 9);

        bikeMountain.applyBrakes(1);
        /*one.changeGear(1);
        one.speedUp(90);
        two.changeGear(-1);
        two.speedUp(-3);
        two.applyBrakes(0);
        */
        //System.out.println(Speedometer.chooseWinner(bikeMountain, bikeRoad));

    }
}
