package com.itacademy.java.oop.basics.task2;

public class BicycleApplication {
    public static void main(String[] args) {
        MountainBike one = new MountainBike(0, 0);
        RoadBike two = new RoadBike(9, 9);

        one.applyBrakes(1);
        /*one.changeGear(1);
        one.speedUp(90);
        two.changeGear(-1);
        two.speedUp(-3);
        two.applyBrakes(0);
        */
        System.out.println(Speedometer.chooseWinner(one, two));

    }
}
