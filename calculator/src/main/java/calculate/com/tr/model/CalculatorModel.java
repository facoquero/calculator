package calculate.com.tr.model;

import java.util.Observable;

/**
 * Created by trumak on 6/20/2015.
 */
public class CalculatorModel extends Observable {

    private double result;

    public void addNumbers(double firstNumber, double secondNumber){
        result = firstNumber + secondNumber;

    }

    public void subtractNumbers(double minuend, double subtrahend){

        result = minuend - subtrahend;

    }

    public void multiplyNumbers(double firstNumber, double secondNumber){

        result = firstNumber * secondNumber;

    }

    public void divideNumbers(double dividend, double divisor){

        result = dividend/divisor;

    }

    public double getResult() {
        return result;
    }
}
