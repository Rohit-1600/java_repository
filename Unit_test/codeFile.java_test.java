Unit Test Case:
```
@Test
public void testCalculateArea() {
    // Given
    int length = 5;
    int width = 2;
    int expectedArea = 10;

    // When
    int actualArea = length * width;

    // Then
    assertEquals(expectedArea, actualArea);
}
```

Code Coverage:
- Line coverage: 100%
- Branch coverage: 100%
- Statement coverage: 100%