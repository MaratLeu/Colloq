import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Vector;

public class FactorialCalculatorTest {
    @Test
    void testZeroInput() {
        Vector<Long> result = FactorialCalculator.factorial(0);
        Vector<Long> expected = new Vector<>(Arrays.asList(1L));
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testPositiveInput() {
        Vector<Long> result = FactorialCalculator.factorial(5);
        Vector<Long> expected = new Vector<>(Arrays.asList(1L, 1L, 2L, 6L, 24L));
        Assertions.assertEquals(expected, result);
    }


    @Test
    void testNegativeInput() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-5));
    }

}
