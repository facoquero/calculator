package calculate.com.mj.model;

import calculate.com.mj.constants.CALC_OPER;
import calculate.com.mj.utils.KeyMapperUtil;

import java.util.Observable;

public class CalculatorViewModel extends Observable {

    private Double firstArgument;
    private Double secondArgument;
    private CALC_OPER operation;
    private BusinessModel businessModel = new BusinessModel();

    private boolean hasColonSetInArgument = false;

    public void provideDigitForArgument(String digit) {

        if (isColon(digit)) {
            hasColonSetInArgument = true;
            return;
        }

        if (isOperationProvided()) {
            secondArgument = addDigitToArgument(digit, secondArgument);
            notifyObservers(secondArgument.toString());
        } else {
            firstArgument = addDigitToArgument(digit, firstArgument);
            notifyObservers(firstArgument.toString());
        }

    }


    private boolean isOperationProvided() {
        return operation != null;
    }

    private Double addDigitToArgument(String digit, Double argument) {
        if (isArgumentInitialized(argument)) {

            String newArgumentRepresentation;

            if (hasColonSetInArgument) {
                newArgumentRepresentation = addDigitAfterColon(digit, argument);
            } else {
                newArgumentRepresentation = addDigitToIntegerPart(digit, argument);
            }


            return prepareArgument(newArgumentRepresentation);
        } else {
            return new Double(digit);
        }
    }

    private String addDigitToIntegerPart(String digit, Double argument) {
        String newArgumentRepresentation;
        newArgumentRepresentation = getStringIntegerPart(argument);
        newArgumentRepresentation += digit;
        return newArgumentRepresentation;
    }

    private String addDigitAfterColon(String digit, Double argument) {
        String newArgumentRepresentation;
        newArgumentRepresentation = addDigitToIntegerPart("." + digit, argument);
        return newArgumentRepresentation;
    }

    private String getStringIntegerPart(Double argument) {
        return String.valueOf(argument.intValue());
    }

    private boolean isColon(String digit) {
        return digit.equals(".");
    }

    private boolean isArgumentInitialized(Double argument) {
        return argument != null;
    }

    public Double getFirstArgument() {
        return firstArgument;
    }

    private Double prepareArgument(String argumentRepresentation) {
        try {
            return Double.parseDouble(argumentRepresentation);
        } catch (Exception e) {
            return null;
        }
    }

    Double getSecondArgument() {
        return secondArgument;
    }

    public void clear() {
        hasColonSetInArgument = false;
        firstArgument = null;
        secondArgument = null;
        operation = null;
    }

    public void provideOperation(String s) {
        if (isArgumentInitialized(firstArgument) && isArgumentInitialized(secondArgument)) {
            execute();
        }
        setOperation(s);
    }

    public void execute() {
        switch (operation) {
            case ADD:
                firstArgument = businessModel.add(firstArgument, secondArgument);
                releaseSecondArgumentAndOperationState();
                break;
            case SUB:
                firstArgument = businessModel.sub(firstArgument, secondArgument);
                releaseSecondArgumentAndOperationState();
                break;
            case DIV:
                firstArgument = businessModel.div(firstArgument, secondArgument);
                releaseSecondArgumentAndOperationState();
                break;
            case MULT:
                firstArgument = businessModel.mult(firstArgument, secondArgument);
                releaseSecondArgumentAndOperationState();
                break;
            default:
                break;
        }
        notifyObservers(firstArgument.toString());
    }

    private void releaseSecondArgumentAndOperationState() {
        secondArgument = null;
        operation = null;
    }

    CALC_OPER getOperation() {
        return operation;
    }

    private void setOperation(String s) {
        operation = KeyMapperUtil.resolveOperation(s);
    }


    public class BusinessModel {

        public Double add(Double firstArgument, Double secondArgument) {
            return firstArgument + secondArgument;
        }

        public Double sub(Double firstArgument, Double secondArgument) {
            return firstArgument - secondArgument;
        }

        public Double div(Double firstArgument, Double secondArgument) {
            return firstArgument / secondArgument;
        }

        public Double mult(Double firstArgument, Double secondArgument) {
            return firstArgument * secondArgument;
        }
    }
}
