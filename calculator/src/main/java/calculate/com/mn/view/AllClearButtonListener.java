package calculate.com.mn.view;

import calculate.com.mn.presenter.businesslogic.CalculatorController;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Michal Niemczyk.
 */
public class AllClearButtonListener implements ActionListener {
    private final CalculatorController calculatorController;

    public AllClearButtonListener(CalculatorController calculatorController) {
        this.calculatorController = calculatorController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        calculatorController.clearEnteredDigits();
    }
}
