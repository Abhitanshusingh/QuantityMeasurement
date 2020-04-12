package com.bridgelabz.service;

import com.bridgelabz.adaptor.IQuantityMeasurement;
import com.bridgelabz.utility.Length;
import com.bridgelabz.adaptor.QuantityMeasurementFactory;

public class QuantityMeasurementService {

    public boolean compareValue(Length value1, Length value2) {
        IQuantityMeasurement object = QuantityMeasurementFactory.getObject();
        boolean result = object.compareValue(value1, value2);
        return result;
    }

    public Double addTwoValues(Length value1 , Length value2) {
        IQuantityMeasurement object = QuantityMeasurementFactory.getObject();
        Double result = object.addTwoValue(value1, value2);
        return result;
    }
}
