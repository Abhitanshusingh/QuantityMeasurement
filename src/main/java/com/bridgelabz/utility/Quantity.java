package com.bridgelabz.utility;

import java.util.Objects;

public class Quantity {
    public Double quantity;

    public Quantity(Double distance, Unit unit) {
        this.quantity = unit.convertToBaseValue(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Quantity quantity1 = (Quantity) o;
        return Objects.equals(quantity, quantity1.quantity);
    }
}

