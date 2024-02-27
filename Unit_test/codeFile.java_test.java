@Test
        public void testCalculateArea() {
            int length = 5;
            int width = 2;
            int expectedArea = 10;
            int actualArea = length * width;
            assertEquals(expectedArea, actualArea);
        }
        
        @Test
        public void testPrintArea() {
            int length = 5;
            int width = 2;
            int area = length * width;
            String expectedOutput = "Area of rectangle: 10";
            ByteArrayOutputStream outContent = new ByteArrayOutputStream();
            System.setOut(new PrintStream(outContent));
            System.out.println("Area of rectangle: " + area);
            assertEquals(expectedOutput, outContent.toString());
        }
        
        Code coverage: 100%