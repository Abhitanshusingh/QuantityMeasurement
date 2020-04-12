import com.bridgelabz.utility.Length;
import com.bridgelabz.utility.Unit;
import com.bridgelabz.service.QuantityMeasurementService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    QuantityMeasurementService quantityMeasurementService;
    boolean result;

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
    public void givenFeet_WhenNull_ShouldReturnFalse() {
        Length firstValue = new Length(0.1, Unit.FEET);
        Length secondValue = null;
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenFeet_WhenSameReference_ShouldReturntrue() {
        Length firstValue = new Length(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, firstValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeet_WhenTypeIsSame_ShouldReturntrue() {
        Length firstValue = new Length(0.1, Unit.FEET);
        Length secondValue = new Length(0.1, Unit.FEET);
        result = quantityMeasurementService.compareValue(firstValue, secondValue);
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFeet_WhenValueIsSame_ShouldReturntrue() {
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
}
