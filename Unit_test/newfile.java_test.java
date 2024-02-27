Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.*;

public class StringReverseTest {

    @Test
    public void testReverseString() {
        String originalStr = "Hello";
        String expectedStr = "olleH";

        String reversedStr = StringReverse.reverseString(originalStr);

        assertEquals(expectedStr, reversedStr);
    }
}

Code Coverage: 100%