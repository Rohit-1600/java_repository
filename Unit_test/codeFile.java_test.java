**Unit Test Case:**
```
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        int length = 5;
        int width = 2;
        int expectedArea = 10;
        int actualArea = Rectangle.calculateArea(length, width);
        assertEquals(expectedArea, actualArea);
    }
}
```

**Code Coverage:**
The code coverage for this unit test is 100%, as it covers all lines of code in the given code snippet.