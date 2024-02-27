Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayTest {

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

Code coverage: 100%