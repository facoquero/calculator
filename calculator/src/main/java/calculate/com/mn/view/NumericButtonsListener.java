package calculate.com.mn.view;

import calculate.com.mn.controller.CalculatorController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericButtonsListener implements ActionListener {

    CalculatorController controller;

    public NumericButtonsListener(CalculatorController controller) {
        this.controller = controller;
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(((JButton) event.getSource()).getText());
        int digit = Integer.parseInt(((JButton) event.getSource()).getText());
        controller.prepareDigitToDisplay(digit);
        System.out.println(controller.getEnteredDigit());

    }

}
