package com.techmeskills.lesson5.task2;

import com.techmeskills.lesson5.task2.enums.HeadLightType;

public class Headlight {
    HeadLightType headLightType;
    boolean isHeadLightOn;

    public Headlight(HeadLightType headLightType, boolean isHeadLightOn) {
        this.headLightType = headLightType;
        this.isHeadLightOn = isHeadLightOn;
    }

    public boolean isHeadLightOn() {
        return isHeadLightOn;
    }

    public void setHeadLightOn(boolean headLightOn) {
        isHeadLightOn = headLightOn;
    }

    public void turnOnHeadlight() {
        setHeadLightOn(true);
        System.out.println("Фары включены");
    }

    public void turnOffHeadlight() {
        setHeadLightOn(false);
        System.out.println("Фары выключены");
    }
}
