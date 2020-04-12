package com.bridgelabz.utility;

import java.util.Objects;

public class Length {
    public Double length;

    public Length(Double distance, Unit unit) {
        this.length = unit.convertToBaseValue(distance);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length1 = (Length) o;
        return Objects.equals(length, length1.length);
    }
}

