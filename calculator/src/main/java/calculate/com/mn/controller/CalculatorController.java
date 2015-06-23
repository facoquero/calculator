package calculate.com.mn.controller;

public class CalculatorController {

    public int getEnteredDigit() {
        return enteredDigit;
    }


    int enteredDigit = 0;


    public void prepareDigitToDisplay(int digit) {
        String enteredDigitString = String.valueOf(enteredDigit);
        if (enteredDigitString.length() < 8) {
            String mergedDigitString =
                    enteredDigitString + String.valueOf(digit);
            enteredDigit = Integer.valueOf(mergedDigitString);
        }
    }

    public void clearEnteredDigits() {
        enteredDigit = 0;
    }

    public double sum(double digitOne, double digitTwo) {
        return digitOne + digitTwo;
    }

    public double subtract(double digitOne, double digitTwo) {
        return digitOne - digitTwo;
    }
}
