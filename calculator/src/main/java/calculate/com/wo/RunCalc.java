package calculate.com.wo;

import calculate.com.wo.model.*;
import calculate.com.wo.ui.*;
import calculate.com.wo.presenter.*;

/**
 * Created by wobara on 7/13/2015.
 */
public class RunCalc
{

	public static void main(String[] args){
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorPresenter thePresenter = new CalculatorPresenter(theView, theModel);

		theView.createContent();
		theView.setVisible(true);

	}
}
