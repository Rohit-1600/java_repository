**Unit Test Case:**

```
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class ArraySumTest {
	
	@Mock
	int[] myArray = {1, 5, 10, 25};
	
	@Test
	public void testArraySum() {
		int sum = 0;
		int i;
		
		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		
		// Assert that the sum is equal to the expected value
		assertEquals(41, sum);
	}
	
	@Test
	public void testArraySumWithMock() {
		// Create a mock array with different values
		int[] mockArray = {2, 8, 15, 30};
		
		int sum = 0;
		int i;
		
		// Loop through the mock array elements and store the sum in the sum variable
		for (i = 0; i < mockArray.length; i++) {
			sum += mockArray[i];
		}
		
		// Assert that the sum is equal to the expected value
		assertEquals(55, sum);
	}
	
	@Test
	public void testArraySumWithEmptyArray() {
		// Create an empty array
		int[] emptyArray = {};
		
		int sum = 0;
		int i;
		
		// Loop through the empty array elements and store the sum in the sum variable
		for (i = 0; i < emptyArray.length; i++) {
			sum += emptyArray[i];
		}
		
		// Assert that the sum is equal to 0
		assertEquals(0, sum);
	}
	
	@Test
	public void testArraySumWithNegativeValues() {
		// Create an array with negative values
		int[] negativeArray = {-1, -5, -10, -25};
		
		int sum = 0;
		int i;
		
		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < negativeArray.length; i++) {
			sum += negativeArray[i];
		}
		
		// Assert that the sum is equal to the expected value
		assertEquals(-41, sum);
	}
	
	@Test
	public void testArraySumWithLargeValues() {
		// Create an array with large values
		int[] largeArray = {100, 500, 1000, 2500};
		
		int sum = 0;
		int i;
		
		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < largeArray.length; i++) {
			sum += largeArray[i];
		}
		
		// Assert that the sum is equal to the expected value
		assertEquals(4100, sum);
	}
	
	@Test
	public void testArraySumWithNullArray() {
		// Create a null array
		int[] nullArray = null;
		
		int sum = 0;
		int i;
		
		// Loop through the null array elements and store the sum in the sum variable
		for (i = 0; i < nullArray.length; i++) {
			sum += nullArray[i];
		}
		
		// Assert that the sum is equal to 0
		assertEquals(0, sum);
	}
	
	@Test
	public void testArraySumWithZeroValues() {
		// Create an array with zero values
		int[] zeroArray = {0, 0, 0, 0};
		
		int sum = 0;
		int i;
		
		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < zeroArray.length; i++) {
			sum += zeroArray[i];
		}
		
		// Assert that the sum is equal to 0
		assertEquals(0, sum);
	}
	
	@Test
	public void testArraySumWithOneElement() {
		// Create an array with one element
		int[] oneElementArray = {5};
		
		int sum = 0;
		int i;
		
		// Loop through the array elements and store the sum in the sum variable
		for (i = 0; i < oneElementArray.length; i++) {
			sum += oneElementArray[i];
		}
		
		// Assert that the sum is equal to the expected value
		assertEquals(5, sum);
	}
	
	@Test
	public void testArraySumWithNegativeOneElement() {