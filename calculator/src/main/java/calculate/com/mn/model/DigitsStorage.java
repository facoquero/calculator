package calculate.com.mn.model;

/**
 * Created by Michał on 2015-07-02.
 */
public class DigitsStorage {

    double firstArgument;
    double secondArgument;
    MathOperator mathOperator;

    public void storeNumber(double enteredNumber) {
        System.out.println( "enteredNumber = " + enteredNumber );
        if (mathOperator != null) {
            firstArgument = enteredNumber;
        } else {
            secondArgument = enteredNumber;
        }
    }

    public void storeMathOperator(MathOperator mathOperator) {
        this.mathOperator = mathOperator;
    }

    public double getFirstArgument() {
        return firstArgument;
    }

    public double getSecondArgument() {
        return secondArgument;
    }

    public MathOperator getMathOperator() {
        return mathOperator;
    }


    public void clear()
    {
        firstArgument = 0;
        secondArgument = 0;
        mathOperator = null;
    }
}
