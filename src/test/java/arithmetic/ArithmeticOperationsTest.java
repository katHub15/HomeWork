package arithmetic;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticOperationsTest {

    @Test
    public void testAdd() {
        assertEquals(ArithmeticOperations.add(3, 4), 7);
    }

    @Test
    public void testSubtract() {
        assertEquals(ArithmeticOperations.subtract(3, 4), -1);
    }

    @Test
    public void testMultiply() {
        assertEquals(ArithmeticOperations.multiply(3, 4), 12);
    }

    @Test
    public void testDivide() {
        assertEquals(ArithmeticOperations.divide(10, 5), 2.0);
    }
}
