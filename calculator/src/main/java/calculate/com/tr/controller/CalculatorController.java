package calculate.com.tr.controller;



import calculate.com.tr.model.CalculatorModel;
import calculate.com.tr.view.CalculatorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by trumak on 6/22/2015.
 */
public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;
    private StringBuffer toBePrintOnTextField = new StringBuffer();



    public CalculatorController(CalculatorView theView, CalculatorModel theModel){

        this.theView = theView;
        this.theModel = theModel;

        this.theView.addZeroActionListener(new ListenOnZeroButton());
        this.theView.addOneActionListener(new ListenOnOneButton());
        this.theView.addTwoActionListener(new ListenOnTwoButton());
        this.theView.addThreeActionListner(new ListenOnThreeButton());
        this.theView.addFourActionListner(new ListenOnFourButton());
        this.theView.addFiveActionListner(new ListenOnFiveButton());
        this.theView.addSixActionListner(new ListenOnSixButton());
        this.theView.addSevenActionListner(new ListenOnSevenButton());
        this.theView.addEightActionListner(new ListenOnEightButton());
        this.theView.addNineActionListner(new ListenOnNineButton());
        this.theView.addPeriodListner(new ListenOnPeriodButton());
        this.theView.addAdditionListner(new ListenOnAdditionButton());
        this.theView.addMinusListner(new ListenOnMinusButton());
        this.theView.addMultiplyListner(new ListenOnMultiplyButton());
        this.theView.addEqualityListner(new ListenOnEqualityButton());
        this.theView.addDivisionListner(new ListenOnDivisionButton());


    }

    class ListenOnOneButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

            JButton buttonOne = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonOne.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());

            System.out.print(buttonOne.getText());

        }
    }

    class ListenOnZeroButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton zeroButton = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(zeroButton.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnTwoButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonTwo = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonTwo.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnThreeButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonThree = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonThree.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnFourButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonFour = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonFour.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnFiveButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonFive = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonFive.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnSixButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonSix = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonSix.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnSevenButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonSeven = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonSeven.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnEightButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonEight = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonEight.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnNineButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonNine = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonNine.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnPeriodButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonPeriod = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(buttonPeriod.getText());
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnAdditionButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonAddition = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(" " + buttonAddition.getText() + " ");
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnMinusButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonMinus = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(" " + buttonMinus.getText() + " ");
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnMultiplyButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonMultiply = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(" " + buttonMultiply.getText() + " ");
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnEqualityButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonEquality = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(" " + buttonEquality.getText() + " ");
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }

    class ListenOnDivisionButton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            JButton buttonDivision = (JButton) actionEvent.getSource();
            toBePrintOnTextField.append(" " + buttonDivision.getText() + " ");
            theView.setTextOnTextField(toBePrintOnTextField.toString());
        }
    }


}


