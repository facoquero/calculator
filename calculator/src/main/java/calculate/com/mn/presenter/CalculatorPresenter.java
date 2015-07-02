package calculate.com.mn.presenter;

import calculate.com.mn.model.DigitsStorage;
import calculate.com.mn.model.MathOperator;
import calculate.com.mn.ui.CalculatorDisplay;

/**
 * Created by Michał on 2015-07-02.
 */
public class CalculatorPresenter {
    CalculatorDisplay display;
    DigitsStorage digitsStorage;

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
}
