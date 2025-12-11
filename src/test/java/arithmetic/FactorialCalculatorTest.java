package arithmetic;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialCalculatorTest {

    @Test
    void testFactorial() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testFactorialZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }
}
