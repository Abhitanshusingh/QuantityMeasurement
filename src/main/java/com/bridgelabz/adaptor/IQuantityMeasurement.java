package com.bridgelabz.adaptor;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.Quantity;

public interface IQuantityMeasurement {

    public boolean compareValue(Quantity value1, Quantity value2) throws QuantityMeasurementException;

    public Double addTwoValue(Quantity value1, Quantity value2) throws QuantityMeasurementException;
}
