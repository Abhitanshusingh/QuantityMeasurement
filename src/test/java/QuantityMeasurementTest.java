import com.bridgelabz.utility.Quantity;
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
        Quantity firstValue = new Quantity(0.0, Unit.FEET);
        Quantity secondValue = new Quantity(0.0, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenNonZeroFeet_WhenNotEqualsZero_ShouldReturnFalse() {
        Quantity firstValue = new Quantity(0.5, Unit.FEET);
        Quantity secondValue = new Quantity(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInFeet_WhenNull_ShouldReturnFalse() {
        Quantity firstValue = new Quantity(0.1, Unit.FEET);
        Quantity secondValue = null;
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInFeet_WhenSameReference_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInFeet_WhenTypeIsSame_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(0.1, Unit.FEET);
        Quantity secondValue = new Quantity(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeet_WhenValueIsSame_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(10.0, Unit.FEET);
        Quantity secondValue = new Quantity(10.0, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    //TEST CASE FOR INCH
    @Test
    public void givenZeroInch_WhenEqualsZero_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(0.0, Unit.INCH);
        Quantity secondValue = new Quantity(0.0, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInch_WhenNull_ShouldReturnFalse() {
        Quantity firstValue = new Quantity(0.1, Unit.INCH);
        Quantity secondValue = null;
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInch_WhenSameReference_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(0.1, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInInch_WhenTypeIsSame_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(0.1, Unit.INCH);
        Quantity secondValue = new Quantity(0.1, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInInch_WhenValueIsSame_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(10.0, Unit.INCH);
        Quantity secondValue = new Quantity(10.0, Unit.INCH);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenFeetIsEqualToYard_ShouldReturnTrue() {
        Quantity secondValue = new Quantity(3.0, Unit.FEET);
        Quantity firstValue = new Quantity(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenFeetIsNotEqualToYard_ShouldReturnFalse() {
        Quantity secondValue = new Quantity(1.0, Unit.FEET);
        Quantity firstValue = new Quantity(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInLength_WhenInchIsNotEqualToYard_ShouldReturnFalse() {
        Quantity secondValue = new Quantity(1.0, Unit.INCH);
        Quantity firstValue = new Quantity(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenInLength_WhenInchIsEqualToYard_ShouldReturnTrue() {
        Quantity secondValue = new Quantity(36.0, Unit.INCH);
        Quantity firstValue = new Quantity(1.0, Unit.YARD);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenYardIsEqualToFeet_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(1.0, Unit.YARD);
        Quantity secondValue = new Quantity(3.0, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenInchEqualToCentimeter_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(2.0, Unit.INCH);
        Quantity secondValue = new Quantity(5.0, Unit.CENTIMETRE);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenInLength_WhenAddedTwoLengthInIch_ShouldReturntInInch() {
        Quantity firstValue = new Quantity(2.0, Unit.INCH);
        Quantity secondValue = new Quantity(2.0, Unit.INCH);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(4.0, result1, 0.0);
    }

    @Test
    public void givenInLength_WhenAddedFeetAndInch_ShouldReturntInInch() {
        Quantity firstValue = new Quantity(1.0, Unit.FEET);
        Quantity secondValue = new Quantity(2.0, Unit.INCH);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(14.0, result1, 0.0);
    }

    @Test
    public void givenInLength_WhenAddedFeetAndFeet_ShouldReturntInInch() {
        Quantity firstValue = new Quantity(1.0, Unit.FEET);
        Quantity secondValue = new Quantity(1.0, Unit.FEET);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(24.0, result1, 0.0);
    }

    @Test
    public void givenInLength_WhenAddedInchAndCentimeter_ShouldReturntInInch() {
        Quantity firstValue = new Quantity(2.0, Unit.INCH);
        Quantity secondValue = new Quantity(2.5, Unit.CENTIMETRE);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(3.0, result1, 0.0);
    }

    @Test
    public void givenInLitres_WhenGallonIsEqualToLitres_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(1.0, Unit.GALLON);
        Quantity secondValue = new Quantity(3.78, Unit.LITRES);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInLitres_WhenLitreIsEqualToMillilitres_ShouldReturnTrue() {
        Quantity firstValue = new Quantity(1.0, Unit.LITRES);
        Quantity secondValue = new Quantity(1000.0, Unit.MILLILITRES);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true,result);
    }

    @Test
    public void givenInGallonAndLitre_WhenAdded_ShouldReturntInLitres() {
        Quantity firstValue = new Quantity(1.0, Unit.GALLON);
        Quantity secondValue = new Quantity(3.78, Unit.LITRES);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(7.56, result1, 0.0);
    }

    @Test
    public void givenInLitreAndMillilitres_WhenAdded_ShouldReturntInLitres() {
        Quantity firstValue = new Quantity(1.0, Unit.LITRES);
        Quantity secondValue = new Quantity(1000.0, Unit.MILLILITRES);
        result1 = quantityMeasurementService.addTwoValues(firstValue, secondValue);
        Assert.assertEquals(2.0, result1, 0.0);
    }
}
