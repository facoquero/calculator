package calculate.com.wo.presenter;

import calculate.com.mj.mvp.model.CalculatorModel;
import calculate.com.wo.ui.CalculatorView;

public class CalculatorPresenter implements Presenter
{

    CalculatorView theView;
    CalculatorModel theModel;

    public CalculatorPresenter(CalculatorView theView, CalculatorModel theModel)
    {
        this.theModel = theModel;
        this.theView = theView;
    }
}
