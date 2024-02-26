Unit Test Case:
```
@Test
public void testReverseString() {
    // Arrange
    String originalStr = "Hello";
    String expectedStr = "olleH";

    // Act
    String reversedStr = "";
    for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
    }

    // Assert
    assertEquals(expectedStr, reversedStr);
}
```

Code Coverage:
- Line 1: String originalStr = "Hello"; (covered by Arrange)
- Line 2: String reversedStr = ""; (covered by Arrange)
- Line 4: for (int i = 0; i < originalStr.length(); i++) { (covered by Act)
- Line 5: reversedStr = originalStr.charAt(i) + reversedStr; (covered by Act)
- Line 7: System.out.println("Reversed string: "+ reversedStr); (not covered by test case, as it is only for printing and not critical functionality)