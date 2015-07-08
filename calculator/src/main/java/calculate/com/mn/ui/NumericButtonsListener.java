package calculate.com.mn.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import calculate.com.mn.presenter.CalculatorPresenter;

public class NumericButtonsListener implements ActionListener {

    CalculatorPresenter calculatorPresenter;


    public NumericButtonsListener( CalculatorPresenter calculatorPresenter )
    {
        this.calculatorPresenter = calculatorPresenter;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(((JButton) event.getSource()).getText());
        int digit = Integer.parseInt(((JButton) event.getSource()).getText());
        System.out.println(digit);
        this.calculatorPresenter.storePressedDigitToStorage( digit );

    }

}
