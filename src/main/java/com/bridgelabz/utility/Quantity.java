package com.bridgelabz.utility;

import java.util.Objects;

public class Quantity {
    public Double quantity;
    public MeasurementType QuantityType;

    public Quantity(Double quantity, Unit unit) {
        this.quantity = unit.convertToBaseValue(quantity, unit);
        this.QuantityType = unit.QuantityType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity1 = (Quantity) o;
        return Objects.equals(quantity, quantity1.quantity);
    }
}

