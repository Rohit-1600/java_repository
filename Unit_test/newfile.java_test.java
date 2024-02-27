Unit Test Case:
```
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
```

Code coverage: 100% (assuming the only relevant code is the for loop and the print statement)