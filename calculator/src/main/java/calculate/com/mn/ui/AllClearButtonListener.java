package calculate.com.mn.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import calculate.com.mn.presenter.CalculatorPresenter;

/**
 * @author Michal Niemczyk.
 */
public class AllClearButtonListener implements ActionListener {

    CalculatorPresenter presenter;


    public AllClearButtonListener( CalculatorPresenter presenter )
    {
        this.presenter = presenter;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        presenter.clear();

    }
}
