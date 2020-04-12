package com.bridzelabz.service;

import com.bridzelabz.conversions.Unit;

public class QuantityMeasurementService {
    private static double FIRST_VALUE;
    private static double SECOND_VALUE;

    //METHOD TO GET CONVERSIONS
    public boolean getConversion(Unit type, double value1, double value2) {
        setPreValues(type);
        double operation1 = value1 * FIRST_VALUE;
        double operation2 = value2 * SECOND_VALUE;

        if (operation1 == operation2)
            return true;                                                     BridgeLabz
        if (operation1 != operation2)
            return false;
        return true;
    }
    //TO SET VALUES
    private void setPreValues(Unit type) {
        FIRST_VALUE = type.firstValue;
        SECOND_VALUE = type.secondValue;
    }
}
