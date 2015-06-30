package calculate.com.mj.mvp.ui.actions;

import calculate.com.mj.mvp.CalculatorPresenter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by mj on 2015-06-30.
 */
public class DigitAction implements ActionListener{

    private CalculatorPresenter presenter;

    @Override
    public void actionPerformed(ActionEvent e) {
        presenter.digitComes();
    }
}
