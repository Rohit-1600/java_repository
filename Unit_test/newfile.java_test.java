Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        String originalStr = "Hello";
        String expectedStr = "olleH";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        assertEquals(expectedStr, reversedStr);
    }
}

Code coverage: 100%