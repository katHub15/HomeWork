package arithmetic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TriangleAreaCalculatorTest {

    @Test
    void testArea() {
        assertEquals(10, TriangleAreaCalculator.area(4, 5));
    }

    @Test
    void testInvalid() {
        assertThrows(IllegalArgumentException.class, () -> TriangleAreaCalculator.area(-1, 5));
    }
}
