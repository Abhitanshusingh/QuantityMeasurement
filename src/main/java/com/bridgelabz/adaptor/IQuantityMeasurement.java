package com.bridgelabz.adaptor;

import com.bridgelabz.utility.Quantity;

public interface IQuantityMeasurement {

    public boolean compareValue(Quantity value1, Quantity value2);

    public Double addTwoValue(Quantity value1, Quantity value2);
}
