package com.bridgelabz.utility;

public enum Unit {
    FEET(12.0),INCH(1.0),YARD(36.0),CENTIMETER(0.4);

    public Double value;

    Unit(double value) {
        this.value = value;
    }

    public Double convertToBaseValue(Double length) {
        return length * value;
    }
}
