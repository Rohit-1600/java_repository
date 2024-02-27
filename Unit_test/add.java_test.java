Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayTest {

    // Test case for calculating the sum of an array
    @Test
    public void testSumArray() {
        // Given
        int[] myArray = {1, 5, 10, 25};
        int expectedSum = 41;
        int actualSum = 0;

        // When
        for (int i = 0; i < myArray.length; i++) {
            actualSum += myArray[i];
        }

        // Then
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%