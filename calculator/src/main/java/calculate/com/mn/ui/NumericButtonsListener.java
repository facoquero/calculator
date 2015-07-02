package calculate.com.mn.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumericButtonsListener implements ActionListener {


    public NumericButtonsListener() {
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println(((JButton) event.getSource()).getText());
        int digit = Integer.parseInt(((JButton) event.getSource()).getText());
        System.out.println(digit);

    }

}
