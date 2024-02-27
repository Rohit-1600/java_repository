Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UnitTestGenerator {

    @Test
    public void testReverseString() {
        //given
        String originalStr = "Hello";
        String reversedStr = "";

        //when
        for (int i = 0; i < originalStr.length(); i++) {
            reversedStr = originalStr.charAt(i) + reversedStr;
        }

        //then
        assertEquals("olleH", reversedStr);
    }
}

Code Coverage: 100%