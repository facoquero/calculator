package calculate.com.mn.presenter;

import calculate.com.mn.model.DigitsStorage;
import calculate.com.mn.view.CalculatorDisplay;

/**
 * Created by Michał on 2015-07-02.
 */
public class CalculatorPresenter {
    CalculatorDisplay display;
    DigitsStorage digitsStorage;

    public void storeDigitsToStorage() {
        double enteredNumber = display.getEnteredNumber();
        digitsStorage.storeNumber(enteredNumber);
    }
}
