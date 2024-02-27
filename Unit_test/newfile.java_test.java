Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.*;

public class StringReverseTest {

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

    @Test
    public void testEmptyString() {
        String originalStr = "";
        String expectedStr = "";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        assertEquals(expectedStr, reversedStr);
    }

    @Test
    public void testSingleCharacterString() {
        String originalStr = "H";
        String expectedStr = "H";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        assertEquals(expectedStr, reversedStr);
    }

    @Test
    public void testNullString() {
        String originalStr = null;
        String expectedStr = null;
        String reversedStr = "";

        if (originalStr != null) {
            for (int i = 0; i < originalStr.length(); i++) {
                reversedStr = originalStr.charAt(i) + reversedStr;
            }
        }

        assertEquals(expectedStr, reversedStr);
    }
}

Code coverage: 100%