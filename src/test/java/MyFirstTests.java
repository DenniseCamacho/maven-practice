import org.junit.Test;
import static org.junit.Assert.*;


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


    }//end main
