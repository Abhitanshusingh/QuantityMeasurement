package com.bridgelabz.utility;

public enum Unit {
    FEET(12.0, MeasurementType.LENGHT),
    INCH(1.0, MeasurementType.LENGHT),
    YARD(36.0, MeasurementType.LENGHT),
    CENTIMETRE(0.4, MeasurementType.LENGHT),

    GALLON(3.78, MeasurementType.VOLUME),
    LITRES(1, MeasurementType.VOLUME),
    MILLILITRES(0.001, MeasurementType.VOLUME),

    KILOGRAMS(1.0, MeasurementType.WEIGHT),
    GRAMS(0.001, MeasurementType.WEIGHT),
    TONNE(1000, MeasurementType.WEIGHT),

    FAHRENHEIT(5.0 / 9.0, MeasurementType.TEMPERATURE),
    CELSIUS(9.0 / 5.0, MeasurementType.TEMPERATURE);

    public Double value;
    public MeasurementType QuantityType;

    Unit(double value, MeasurementType type) {
        this.value = value;
        this.QuantityType = type;
    }

    public Double convertToBaseValue(Double quantity, Unit unit) {
        switch (unit) {
            case FAHRENHEIT:
                return ((quantity - 32) * (value));
            case CELSIUS:
                return ((quantity * (value)) + 32);
            default:
                return quantity * this.value;
        }
    }
}
