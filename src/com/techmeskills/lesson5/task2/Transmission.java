package com.techmeskills.lesson5.task2;

import com.techmeskills.lesson5.task2.enums.TransmissionRegime;

public class Transmission {
    TransmissionRegime transmissionRegime;

    public Transmission(TransmissionRegime transmissionRegime) {
        this.transmissionRegime = transmissionRegime;
    }

    public TransmissionRegime getTransmissionRegime() {
        return transmissionRegime;
    }

    public void setTransmissionRegime(TransmissionRegime transmissionRegime) {
        this.transmissionRegime = transmissionRegime;
    }

}
