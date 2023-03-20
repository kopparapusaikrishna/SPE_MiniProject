
//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        assertEquals(2.0, Calculator.squareRoot(4),0.0f);
        assertEquals(3.0, Calculator.squareRoot(9),0.0f);
        assertEquals(4.0, Calculator.squareRoot(16),0.0f);
        assertEquals(5.0, Calculator.squareRoot(25),0.0f);
        assertEquals(6.0, Calculator.squareRoot(36),0.0f);
    }

    @Test
    public void testFactorial() {
        assertEquals(1, Calculator.factorial(0));
        assertEquals(1, Calculator.factorial(1));
        assertEquals(6, Calculator.factorial(3));
        assertEquals(24, Calculator.factorial(4));
        assertEquals(720, Calculator.factorial(6));
    }

    @Test
    public void testnaturalLog() {
        assertEquals(1.0, Calculator.naturalLog(Math.E),0.2f);
        assertEquals(0.0, Calculator.naturalLog(1),0.2f);
        assertEquals(0.6931, Calculator.naturalLog(2),0.2f);
        assertEquals(1.3862, Calculator.naturalLog(4),0.2f);
        assertEquals(2.3026, Calculator.naturalLog(10),0.2f);
    }

    @Test
    public void testpowerFunction() {
        assertEquals(4.0, Calculator.powerFunction(2, 2),0.0f);
        assertEquals(8.0, Calculator.powerFunction(2, 3),0.0f);
        assertEquals(9.0, Calculator.powerFunction(3, 2),0.0f);
        assertEquals(81.0, Calculator.powerFunction(3, 4),0.0f);
        assertEquals(100.0, Calculator.powerFunction(10, 2),0.0f);
    }
}
