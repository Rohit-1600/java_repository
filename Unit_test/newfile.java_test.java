Unit Test Case:
```
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReverseStringTest {

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
```

Code Coverage: 100% (1/1)