package com.techmeskills.lesson5.task2;

import com.techmeskills.lesson5.task2.enums.DriveUnit;
import com.techmeskills.lesson5.task2.enums.TransmissionRegime;

public class Car {
    Engine engine;

    public Car(Engine engine, Transmission transmission, int steeringAngle, DriveUnit driveUnit, Headlight headlight) {
        this.engine = engine;
        this.transmission = transmission;
        this.steeringAngle = steeringAngle;
        this.driveUnit = driveUnit;
        this.headlight = headlight;
    }

    Transmission transmission;
    int steeringAngle;
    DriveUnit driveUnit;
    Headlight headlight;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getSteeringAngle() {
        return steeringAngle;
    }

    public void setSteeringAngle(int steeringAngle) {
        this.steeringAngle = steeringAngle;
    }

    public DriveUnit getDriveUnit() {
        return driveUnit;
    }

    public void setDriveUnit(DriveUnit driveUnit) {
        this.driveUnit = driveUnit;
    }

    public Headlight getHeadlight() {
        return headlight;
    }

    public void setHeadlight(Headlight headlight) {
        this.headlight = headlight;
    }

    public void stepOnGasPedal() {
        System.out.println("Нажали на педаль газа - ВЖЖЖЖИИИИУУУУУ!!");
    }

    public void stepOnBrakePedal() {
        System.out.println("Нажали на педаль тормоза!");
    }

    public void turnTheSteeringWheel(int steerAngle){
        if (steeringAngle+steerAngle>30) setSteeringAngle(30);
        else if (steeringAngle+steerAngle<-30) setSteeringAngle(-30);
        else setSteeringAngle(steerAngle);
        System.out.println("Меняем угол руля на " + steerAngle + " градусов. Сейчас угол руля " + getSteeringAngle() + " градусов");
    }

    public void turnOnHeadLight(){
        headlight.turnOnHeadlight();
    }

    public void changeTheTransmission(TransmissionRegime transmissionRegime){
        transmission.setTransmissionRegime(transmissionRegime);
        System.out.println("Режим коробки передач сменен на " + transmissionRegime);
    }
}
