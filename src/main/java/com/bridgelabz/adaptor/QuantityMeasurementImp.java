package com.bridgelabz.adaptor;

import com.bridgelabz.exception.QuantityMeasurementException;
import com.bridgelabz.utility.MeasurementType;
import com.bridgelabz.utility.Quantity;

public class QuantityMeasurementImp implements IQuantityMeasurement {

    @Override
    public boolean compareValue(Quantity value1, Quantity value2) throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException
                    (QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, "ENTERED_NULL_VALUE");
        if (value1.QuantityType != value1.QuantityType)
            throw new QuantityMeasurementException
                    (QuantityMeasurementException.ExceptionType.TYPE_NOT_MATCH, "ENTERED_NULL_VALUE");
        if (value1.equals(value2))
            return true;
        return false;
    }

    @Override
    public Double addTwoValue(Quantity value1, Quantity value2) throws QuantityMeasurementException {
        if (value1 == null || value2 == null)
            throw new QuantityMeasurementException
                    (QuantityMeasurementException.ExceptionType.NULL_VALUE_ENTERED, "ENTERED_NULL_VALUE");
        if (value1.QuantityType != value1.QuantityType)
            throw new QuantityMeasurementException
                    (QuantityMeasurementException.ExceptionType.TYPE_NOT_MATCH, "ENTERED_NULL_VALUE");
        if (value1.QuantityType.equals(MeasurementType.TEMPERATURE) && value2.QuantityType.equals(MeasurementType.TEMPERATURE))
            throw new QuantityMeasurementException
                    (QuantityMeasurementException.ExceptionType.CAN_NOT_ADD_TEMPERATURE, "TEMPERATURE_NOT_ADD");
        return value1.quantity + value2.quantity;
    }
}
