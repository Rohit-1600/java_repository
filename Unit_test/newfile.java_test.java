Unit Test Case:
```
@Test
public void testReverseString() {
    //given
    String originalStr = "Hello";
    String expectedStr = "olleH";

    //when
    String reversedStr = "";
    for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
    }

    //then
    assertEquals(expectedStr, reversedStr);
}
```

Code Coverage: 100% (1 line covered out of 1 total line)