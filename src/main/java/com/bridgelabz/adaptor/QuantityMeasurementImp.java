package com.bridgelabz.adaptor;

import com.bridgelabz.utility.Quantity;

public class QuantityMeasurementImp implements IQuantityMeasurement {

    @Override
    public boolean compareValue(Quantity value1, Quantity value2) {
        if (value1.equals(value2))
            return true;
        return false;
    }

    @Override
    public Double addTwoValue(Quantity value1, Quantity value2) {
        return value1.quantity + value2.quantity;
    }
}
