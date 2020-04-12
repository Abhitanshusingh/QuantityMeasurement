package com.bridgelabz.adaptor;

public interface QuantityMeasurementFactory {
    public static IQuantityMeasurement getObject(){
        return  new QuantityMeasurementImp();
    }
}
