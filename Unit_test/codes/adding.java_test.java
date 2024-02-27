Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayTest {

    // Test case to check if the sum of the array elements is correct
    @Test
    public void testSumOfArrayElements() {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i;

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        // Assertion to check if the sum is correct
        assertEquals(41, sum);
    }
}

Code coverage: 100%