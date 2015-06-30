package calculate.com.mj.mvp.ui.indicators;

import calculate.com.mj.mvp.HasCalcIndicator;

import javax.swing.*;

/**
 * Created by mj on 2015-06-30.
 */
public class CalcIndicator implements HasCalcIndicator{

        private final JTextField indicator = new JTextField();

        public CalcIndicator() {
            indicator.setEditable(false);
        }

        public JComponent getComponentForSwing() {
            return indicator;
        }

        @Override
        public void putOnScreen(String message) {
            indicator.setText(message);
        }

        @Override
        public String getMessageFromScreen() {
            return indicator.getText();
        }
}
