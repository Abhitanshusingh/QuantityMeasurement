package com.bridgelabz.utility;

public enum Unit {
    FEET(12),INCH(1),YARD(36);

    public double value;

    Unit(double value) {
        this.value = value;
    }

    public Double convertToBaseValue(Double length) {
        return length * value;
    }
}
