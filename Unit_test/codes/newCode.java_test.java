Unit Test Case:
        
        @Test
        public void testReverseString() {
            String originalStr = "Hello";
            String reversedStr = "";

            for (int i = 0; i < originalStr.length(); i++) {
                reversedStr = originalStr.charAt(i) + reversedStr;
            }

            assertEquals("olleH", reversedStr);
        }
        
        Code Coverage:
        
        The code coverage for this unit test would be 100%, as it covers all lines of code within the for loop and also includes an assertion to verify the correct behavior.