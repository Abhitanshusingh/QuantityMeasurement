import com.bridgelabz.utility.Length;
import com.bridgelabz.utility.Unit;
import com.bridgelabz.service.QuantityMeasurementService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurementService quantityMeasurementService;
    boolean result;
    double result1;

    @Before
    public void setUp() {
        quantityMeasurementService = new QuantityMeasurementService();
    }

    //TEST CASE FOR FEET
    @Test
    public void givenZeroFeet_WhenEqualsZero_ShouldReturnTrue() {
        Length firstValue = new Length(0.0, Unit.FEET);
        Length secondValue = new Length(0.0, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNonZeroFeet_WhenNotEqualsZero_ShouldReturnFalse() {
        Length firstValue = new Length(0.5, Unit.FEET);
        Length secondValue = new Length(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInFeet_WhenNull_ShouldReturnFalse() {
        Length firstValue = new Length(0.1, Unit.FEET);
        Length secondValue = null;
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInFeet_WhenSameReference_ShouldReturnTrue() {
        Length firstValue = new Length(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInFeet_WhenTypeIsSame_ShouldReturnTrue() {
        Length firstValue = new Length(0.1, Unit.FEET);
        Length secondValue = new Length(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeet_WhenValueIsSame_ShouldReturnTrue() {
        Length firstValue = new Length(10.0, Unit.FEET);
        Length secondValue = new Length(10.0, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    //TEST CASE FOR INCH
    @Test
    public void givenZeroInch_WhenEqualsZero_ShouldReturnTrue() {
        Length firstValue = new Length(0.0, Unit.INCH);
        Length secondValue = new Length(0.0, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInch_WhenNull_ShouldReturnFalse() {
        Length firstValue = new Length(0.1, Unit.INCH);
        Length secondValue = null;
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInch_WhenSameReference_ShouldReturnTrue() {
        Length firstValue = new Length(0.1, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInInch_WhenTypeIsSame_ShouldReturnTrue() {
        Length firstValue = new Length(0.1, Unit.INCH);
        Length secondValue = new Length(0.1, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInInch_WhenValueIsSame_ShouldReturnTrue() {
        Length firstValue = new Length(10.0, Unit.INCH);
        Length secondValue = new Length(10.0, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenFeetIsEqualToYard_ShouldReturnTrue() {
        Length secondValue = new Length(3.0, Unit.FEET);
        Length firstValue = new Length(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenFeetIsNotEqualToYard_ShouldReturnFalse() {
        Length secondValue = new Length(1.0, Unit.FEET);
        Length firstValue = new Length(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInLength_WhenInchIsNotEqualToYard_ShouldReturnFalse() {
        Length secondValue = new Length(1.0, Unit.INCH);
        Length firstValue = new Length(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInLength_WhenInchIsEqualToYard_ShouldReturnTrue() {
        Length secondValue = new Length(36.0, Unit.INCH);
        Length firstValue = new Length(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenYardIsEqualToFeet_ShouldReturnTrue() {
        Length firstValue = new Length(1.0, Unit.YARD);
        Length secondValue = new Length(3.0, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenInchEqualToCentimeter_ShouldReturnTrue() {
        Length firstValue = new Length(2.0, Unit.INCH);
        Length secondValue = new Length(5.0, Unit.CENTIMETER);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenAddedTwoLengthInIch_ShouldReturntInInch() {
        Length firstValue = new Length(2.0, Unit.INCH);
        Length secondValue = new Length(2.0, Unit.INCH);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(4.0, result1, 0.0);
    }

    @Test
    public void givenInLength_WhenAddedFeetAndInch_ShouldReturntInInch() {
        Length firstValue = new Length(1.0, Unit.FEET);
        Length secondValue = new Length(2.0, Unit.INCH);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(14.0, result1, 0.0);
    }

    @Test
    public void givenInLength_WhenAddedFeetAndFeet_ShouldReturntInInch() {
        Length firstValue = new Length(1.0, Unit.FEET);
        Length secondValue = new Length(1.0, Unit.FEET);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(24.0, result1, 0.0);
    }

    @Test
    public void givenInLength_WhenAddedInchAndCentimeter_ShouldReturntInInch() {
        Length firstValue = new Length(2.0, Unit.INCH);
        Length secondValue = new Length(2.5, Unit.CENTIMETER);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(3.0, result1, 0.0);
    }

    @Test
    public void givenInLitres_WhenGallonIsEqualToLitres_ShouldReturnTrue() {
        Length firstValue = new Length(1.0, Unit.GALLON);
        Length secondValue = new Length(3.78, Unit.LITRES);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInLitres_WhenLitreIsEqualToMillilitre_ShouldReturnTrue() {
        Length firstValue = new Length(1.0, Unit.LITRES);
        Length secondValue = new Length(1000.0, Unit.MILLILITERS);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true,result);
    }
}
