Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringReverserTest {

    @Test
    public void testReverseString() {
        // Given
        String originalStr = "Hello";
        String expectedStr = "olleH";
        
        // When
        String reversedStr = StringReverser.reverseString(originalStr);
        
        // Then
        assertEquals(expectedStr, reversedStr);
    }
}

Code coverage: 100%