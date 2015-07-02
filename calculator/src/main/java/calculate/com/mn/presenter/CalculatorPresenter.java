package calculate.com.mn.presenter;

import calculate.com.mn.model.DigitsStorage;
import calculate.com.mn.model.MathOperator;
import calculate.com.mn.ui.CalculatorDisplay;
import calculate.com.mn.ui.CalculatorView;

/**
 * Created by Michał on 2015-07-02.
 */
public class CalculatorPresenter {
    CalculatorDisplay display;
    DigitsStorage digitsStorage;

    public CalculatorPresenter(DigitsStorage digitsStorage, CalculatorDisplay display) {
        this.digitsStorage = digitsStorage;
        this.display = display;
    }

    public static CalculatorDisplay createCalculatorView() {
        return new CalculatorView();
    }

    public static DigitsStorage createDigitsStorage() {
        return new DigitsStorage();
    }

    public void storePressedDigitToStorage() {
        String enteredNumber = display.getPressedNummericKeyText();
        digitsStorage.storeNumber(Integer.parseInt(enteredNumber));
    }

    public void storeOperationToStorage() {
        final String operationSymbol = display.getPressedOperationKeyText();
        switch (operationSymbol) {
            case "+":
                digitsStorage.storeMathOperator(MathOperator.ADD);
                break;
            case "-":
                digitsStorage.storeMathOperator(MathOperator.SUBTRACT);
                break;
            case "/":
                digitsStorage.storeMathOperator(MathOperator.DIVIDE);
                break;
            case "*":
                digitsStorage.storeMathOperator(MathOperator.MULTIPLY);
                break;
            default:
                System.out.println("Unsupported operation");
        }
    }

    public void calculate() {
        digitsStorage.getFirstArgument();
        digitsStorage.getSecondArgument();
        digitsStorage.getMathOperator();
    }
}
