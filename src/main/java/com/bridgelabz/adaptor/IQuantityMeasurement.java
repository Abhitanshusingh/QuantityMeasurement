package com.bridgelabz.adaptor;

import com.bridgelabz.utility.Length;

public interface IQuantityMeasurement {

    public boolean compareValue(Length value1, Length value2);

    public Double addTwoValue(Length value1, Length value2);
}
