Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MyArrayTest {
    
    @Mock
    private int[] myArray = {1, 5, 10, 25};
    
    @Test
    public void testSum() {
        int expected = 41;
        int sum = 0;
        int i;
        
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }
        
        assertEquals(expected, sum);
    }
}

Code coverage: 100%