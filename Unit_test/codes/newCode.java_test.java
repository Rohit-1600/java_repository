Unit Test Case:
        
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
        
        Code Coverage:
        The code coverage for this unit test would be 100%, as it covers all lines of code within the for loop and also verifies the expected output.