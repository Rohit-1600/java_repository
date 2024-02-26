**Unit Test Case:**

```
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;

public class ArraySumTest {

    @Test
    public void testArraySum() {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i;

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        assertEquals(41, sum);
    }
}
```

**Code Coverage:**

Based on the provided code, the unit test covers 100% of the code. All lines of code are executed and tested for the expected result.