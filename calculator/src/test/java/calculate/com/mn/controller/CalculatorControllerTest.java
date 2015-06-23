package calculate.com.mn.controller;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Michał on 2015-06-23.
 */
public class CalculatorControllerTest {

    CalculatorController controller = new CalculatorController();

    @Test
    public void addTwoDigits_ShouldSumProper() {
        double digitOne = 1.0;
        double digitTwo = 2.0;

        assertTrue(controller.sum(digitOne, digitTwo) == 3.0);
    }

    @Test
    public void addOnePositiveDigitToNegativeDigit_ShouldSumProper() throws Exception {
        double digitOne = -1.0;
        double digitTwo = 2.0;

        assertTrue(controller.sum(digitOne, digitTwo) == 1.0);

    }

    @Test
    public void subtractTwoDigits_ShouldSubtractProper() throws Exception {
        double digitOne = 10.0;
        double digitTwo = 2.9;

        assertTrue(controller.subtract(digitOne, digitTwo) == 7.1);

    }

    @Test
    public void subtractTwoDigits_ShouldReturnNegative() throws Exception {
        double digitOne = 12.1;
        double digitTwo = 24.2;


        assertTrue(controller.subtract(digitOne, digitTwo) == -12.1);

    }
}