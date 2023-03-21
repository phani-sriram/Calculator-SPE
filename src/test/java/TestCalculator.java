import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal;
    // Test Pipeline completely!
    @Test
    public void SQTruePositive(){
        assertEquals("Finding square root (True Positive)", 5, cal.squareRoot(25), DELTA);
        assertEquals("Finding square root (True Positive)", 6, cal.squareRoot(36), DELTA);
    }

    @Test
    public void SQFalsePositive(){
        assertNotEquals("Finding square root (False Positive)", 1, cal.squareRoot(25), DELTA);
        assertNotEquals("Finding square root (False Positive)", 0, cal.squareRoot(36), DELTA);
    }

    @Test
    public void FactorialTruePositive(){
        assertEquals("Finding factorial (True Positive)", 6, cal.factorial(3), DELTA);
        assertEquals("Finding factorial (True Positive)", 120, cal.factorial(5), DELTA);
    }

    @Test
    public void FactorialFalsePositive(){
        assertNotEquals("Finding factorial (False Positive)", 120, cal.factorial(3), DELTA);
        assertNotEquals("Finding factorial (False Positive)", 6, cal.factorial(5), DELTA);
    }

    @Test
    public void NaturalLogTruePositive(){
        assertEquals("Finding natural logarithm (True Positive)", 0, cal.logarithm(1), DELTA);
        assertEquals("Finding natural logarithm (True Positive)", 0, cal.logarithm(1), DELTA);
    }

    @Test
    public void NaturalLogFalsePositive(){
        assertNotEquals("Finding natural logarithm (False Positive)", 120, cal.logarithm(3), DELTA);
        assertNotEquals("Finding natural logarithm (False Positive)", 6, cal.logarithm(5), DELTA);
    }

    @Test
    public void PowerTruePositive(){
        assertEquals("Finding power (False Positive)", 9, cal.power(3.0, 2.0), DELTA);
        assertEquals("Finding power (False Positive)", 16, cal.power(4.0, 2.0), DELTA);
    }

    @Test
    public void PowerFalsePositive(){
        assertNotEquals("Finding power (False Positive)", 120, cal.power(3, 2), DELTA);
        assertNotEquals("Finding power (False Positive)", 6, cal.power(5, 2), DELTA);
    }

}
