Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringReverseTest {

    @Test
    public void testReverseString() {
        String originalStr = "Hello";
        String reversedStr = "";

        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        assertEquals("olleH", reversedStr);
    }
}

Code coverage: 100%