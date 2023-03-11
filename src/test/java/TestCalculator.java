import static org.junit.Assert.*;
import org.junit.Test;
public class TestCalculator {
    private static final double DELTA = 1e-15;
    Calculator cal;

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
}
