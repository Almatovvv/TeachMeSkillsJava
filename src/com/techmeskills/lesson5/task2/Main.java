package com.techmeskills.lesson5.task2;

import com.techmeskills.lesson5.task2.enums.DriveUnit;
import com.techmeskills.lesson5.task2.enums.EngineType;
import com.techmeskills.lesson5.task2.enums.HeadLightType;
import com.techmeskills.lesson5.task2.enums.TransmissionRegime;

public class Main {
    public static void main(String[] args) {
        //Создаем двигатель
        Engine engine = new Engine(1.8, 1000000, EngineType.Gasoline);
        //Создаем коробку передач
        Transmission transmission = new Transmission(TransmissionRegime.Neutral);
        //Создаем фары
        Headlight headlight = new Headlight(HeadLightType.Xenon, false);
        //Создаем машину
        Car car = new Car(engine, transmission, 0, DriveUnit.FourWheelDrive, headlight);

        //Выполняем действия - нажать на газ, нажать на тормоз, повернуть руль, включить фары, поменять коробку передач
        car.stepOnGasPedal();
        car.stepOnBrakePedal();
        car.turnTheSteeringWheel(40);
        car.turnOnHeadLight();
        car.changeTheTransmission(TransmissionRegime.Drive);
    }
}
