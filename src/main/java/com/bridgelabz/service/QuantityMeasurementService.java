package com.bridgelabz.service;

import com.bridgelabz.adaptor.IQuantityMeasurement;
import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.Quantity;
import com.bridgelabz.adaptor.QuantityMeasurementFactory;

public class QuantityMeasurementService {

    public boolean compareValue(Quantity value1, Quantity value2) throws QuantityMeasurementException {
        IQuantityMeasurement object = QuantityMeasurementFactory.getObject();
        boolean result = object.compareValue(value1, value2);
        return result;
    }

    public Double addTwoValues(Quantity value1 , Quantity value2) throws QuantityMeasurementException {
        IQuantityMeasurement object = QuantityMeasurementFactory.getObject();
        Double result = object.addTwoValue(value1, value2);
        return result;
    }
}
