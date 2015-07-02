package calculate.com.mj.old.controller;



import calculate.com.mj.old.constants.CALC_FUNC;
import calculate.com.mj.old.constants.CALC_OPER;
import calculate.com.mj.old.model.CalculatorViewModel;
import calculate.com.mj.old.utils.KeyMapperUtil;
import calculate.com.mj.old.view.CalculatorView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collection;


public class CalculatorViewController {

    private String displayField = "";
    private CALC_OPER operation = null;
    private CALC_FUNC function = null;

    private CalculatorView view;
    private CalculatorViewModel model;

    public CalculatorViewController() {

        model = createModel();
        view = createView();
        model.addObserver(view);
        JComponent viewContent = view.createContent();
        registerListenersOnView();


        view.showGui(viewContent);

    }

    public static void main(String... args) {
        new CalculatorViewController();

    }

    private CalculatorViewModel createModel() {
        return new CalculatorViewModel();
    }

    private void registerListenersOnView() {
        registerListenerOnKeys(new OperationListener(), view.getOperationKeys());
        registerListenerOnKeys(new ArgumentListener(), view.getNumbersAndColonKeys());
        registerListenerOnKeys(new FunctionListener(), view.getFunctionKeys());
    }

    private void registerListenerOnKeys(ActionListener listener, Collection<JButton> keys) {
        for (JButton operationKey : keys) {
            operationKey.addActionListener(listener);
        }
    }

    protected CalculatorView createView() {
        return new CalculatorView();
    }

    public class OperationListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            operation = KeyMapperUtil
                    .resolveOperation(getLabelFromKey(event));
            if (null == operation) {
                throw new UnsupportedOperationException(
                        "Provided operation is not handled in Controller!");
            }
            System.out.println(operation);
            switch(operation)
            {
                case ADD:
                case DIV:
                case MULT:
                case SUB:
                    model.provideOperation(getLabelFromKey(event));
                    view.getIndicator().setText(model.getFirstArgument().toString());
            }
        }

        private String getLabelFromKey(ActionEvent event) {
            return ((JButton) event.getSource()).getText();
        }
    }

    public class ArgumentListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String keyLabel = getLabelFromKey(event);

            model.provideDigitForArgument(keyLabel);
            view.getIndicator().setText(model.getFirstArgument().toString());
//            displayField += keyLabel;
//
//            ui.getIndicator().setText(displayField);
        }

        private String getLabelFromKey(ActionEvent event) {
            return ((JButton) event.getSource()).getText();
        }

    }

    public class FunctionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            String keyLabel = getLabelFromKey(event);


            function = KeyMapperUtil.resolveFunction(keyLabel);
            if (null == function) {
                throw new UnsupportedOperationException(
                        "Provided function is not handled in Controller!");
            }
            System.out.println(function);
            switch (function){
                case EQ:
                    model.execute();
                    break;
                case CLEAR:
                    model.clear();
                    view.getIndicator().setText("");
            }

        }

        private String getLabelFromKey(ActionEvent event) {
            return ((JButton) event.getSource()).getText();
        }

    }

}
