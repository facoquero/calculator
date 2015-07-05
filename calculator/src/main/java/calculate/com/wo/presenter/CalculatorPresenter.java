package calculate.com.wo.presenter;

import calculate.com.wo.ui.*;
import calculate.com.wo.model.*;

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