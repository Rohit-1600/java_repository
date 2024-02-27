Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayTest {

    // Test case for calculating the sum of an array
    @Test
    public void testSum() {
        // Given
        int[] myArray = {1, 5, 10, 25};
        int expectedSum = 41;

        // When
        int actualSum = MyArray.sumArray(myArray);

        // Then
        assertEquals(expectedSum, actualSum);
    }
}

Code Coverage:

The code coverage for this unit test is 100%, as it covers all lines of code in the given code snippet.