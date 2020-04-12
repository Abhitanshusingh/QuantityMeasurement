package com.bridgelabz.service;

import com.bridgelabz.adaptor.IQuantityMeasurement;
import com.bridgelabz.utility.Length;
import com.bridgelabz.adaptor.QuantityMeasurementFactory;

public class QuantityMeasurementService {

    public boolean compareValue(Length value1, Length value2) {
        IQuantityMeasurement object = QuantityMeasurementFactory.getObject();
        boolean value = object.compareValue(value1, value2);
        return value;
    }
}
