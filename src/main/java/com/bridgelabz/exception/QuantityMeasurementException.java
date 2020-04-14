package com.bridgelabz.exception;

public class QuantityMeasurementException extends Exception {
    public enum ExceptionType {
        TYPE_NOT_MATCH, NULL_VALUE_ENTERED, CAN_NOT_ADD_TEMPERATURE;
    }

    public ExceptionType type;

    public QuantityMeasurementException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
