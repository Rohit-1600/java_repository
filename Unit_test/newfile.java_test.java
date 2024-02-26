Unit Test Case:
```
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {

    @Test
    public void testReverseString() {
        // given
        String originalStr = "Hello";
        String expectedStr = "olleH";

        // when
        String reversedStr = StringReverse.reverseString(originalStr);

        // then
        assertEquals(expectedStr, reversedStr);
    }
}
```

Code Coverage: 100%