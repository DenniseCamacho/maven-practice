import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
//import org.apache.commons.math3.util.Precision;


    public class MyFirstTests {
        private final Calculator calculator = new Calculator();

        @Test
        public void testAdditionMethod(){
            int input1 = 5;
            int input2 = 12;
            int exepectedSum = 17;

            assertEquals(exepectedSum, calculator.addition(input1, input2));
        }//

        @Test
        public void tipCalculatorTest(){
            double cost = 22.56;
            double tip = 15;
            double expectedTip = 3.38;
        assertEquals(expectedTip, calculator.calculateTip(cost, tip), 0.01);
        }                               // fails if you take out delta because ...
                        // assert equals is precise. it goes up to that decimal 3.14...
        @Test
        public void testArrayEquality(){
            int[] startArray = {1, 2, 3, 4};
            int[] endArray = {2, 3, 4, 5};
            int[] startArray2 = {1, 2, 3, 4};
            int[] endArray2 = {11, 12, 13, 14};

            assertArrayEquals(endArray, calculator.addInArray(1, startArray));
            assertArrayEquals(endArray2, calculator.addInArray(10, startArray2));
        }


            @Test
            public void testIfVersionIsSet(){
                assertEquals(0.0, CodeupCrypt.version, 0);
                CodeupCrypt.version = 1.2;
                assertEquals(1.2, CodeupCrypt.version, 0);
            }

            @Test
            public void testHashPassword(){
                assertEquals("C0d39p", CodeupCrypt.hashPassword("Codeup"));
                assertEquals("F3r", CodeupCrypt.hashPassword("Fer"));
                assertEquals("123", CodeupCrypt.hashPassword("123"));
                assertEquals("124", CodeupCrypt.hashPassword("12a"));
            }

            @Test
            public void testCheckPassword(){
                assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
                assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
            }

        }



    }//end main
