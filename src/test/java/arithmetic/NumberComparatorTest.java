package arithmetic;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberComparatorTest {

    @Test
    void testCompareLess() {
        assertEquals(-1, NumberComparator.compare(3, 5));
    }

    @Test
    void testCompareEqual() {
        assertEquals(0, NumberComparator.compare(5, 5));
    }

    @Test
    void testCompareGreater() {
        assertEquals(1, NumberComparator.compare(7, 5));
    }
}
