package calculate.com.tr;


import calculate.com.tr.controller.CalculatorController;
import calculate.com.tr.model.CalculatorModel;
import calculate.com.tr.view.CalculatorView;

/**
 * Created by trumak on 6/23/2015.
 */
public class Start {

    public static void main(String[] args){
        CalculatorView theView = new CalculatorView();
        CalculatorModel theModel = new CalculatorModel();
        CalculatorController theController = new CalculatorController(theView, theModel);

        theView.setVisible(true);

    }
}
