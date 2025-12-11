package arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
