package com.bridgelabz.adaptor;

import com.bridgelabz.utility.Length;

public class QuantityMeasurementImp implements IQuantityMeasurement {

    @Override
    public boolean compareValue(Length value1, Length value2) {
        if (value1.equals(value2))
            return true;
        return false;
    }

    @Override
    public Double addTwoValue(Length value1, Length value2) {
        return value1.length + value2.length;
    }
}
