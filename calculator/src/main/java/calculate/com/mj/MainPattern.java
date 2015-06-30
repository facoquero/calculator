package calculate.com.mj;

import calculate.com.mj.mvp.CalculatorPresenter;
import calculate.com.mj.mvp.model.CalculatorModel;
import calculate.com.mj.mvp.ui.CalculatorView;

/**
 * Created by mj on 2015-06-30.
 */
public class MainPattern {

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        view.createAndShowGui();

        CalculatorPresenter presenter = new CalculatorPresenter(view,new CalculatorModel());
    }
}
