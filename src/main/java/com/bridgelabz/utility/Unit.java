package com.bridgelabz.utility;

public enum Unit {
    FEET(12.0),INCH(1.0),YARD(36.0),CENTIMETRE(0.4),
    GALLON(3.78), LITRES(1), MILLILITRES(0.001),
    KILOGRAMS(1.0), GRAMS(0.001), TONNE(1000),
    FAHRENHEIT(1), CELSIUS(2.12);

    public Double value;

    Unit(double value) {
        this.value = value;
    }

    public Double convertToBaseValue(Double length) {
        return length * value;
    }
}
