package calculate.com.mj.model;


import calculate.com.mj.constants.CALC_OPER;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mj on 2015-06-13.
 */
public class _CalculatorViewModelTest {
    private CalculatorViewModel model;

    @Before
    public void setup() {
        model = new CalculatorViewModel();
    }


    @Test
    public void providingFirstDigit() {

        model.provideDigitForArgument("1");

        assertEquals(new Double(1), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(null, model.getOperation());
    }

    @Test
    public void providingManyDigits() {

        model.provideDigitForArgument("1");
        model.provideDigitForArgument("2");
        model.provideDigitForArgument("3");

        assertEquals(new Double(123), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(null, model.getOperation());
    }

    @Test
    public void providingColonAfterFirstDigit() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");

        assertEquals(new Double(1.1), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(null, model.getOperation());
    }


    @Test
    public void providingSecondColons() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");

        assertEquals(new Double(1.1), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(null, model.getOperation());
    }


    @Test
    public void clearOperationsComes() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("+");
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.clear();

        assertEquals(null, model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(null, model.getOperation());
    }

    @Test
    public void addingComes() {
        model.provideOperation("+");

        assertEquals(null, model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(CALC_OPER.ADD, model.getOperation());
    }

    @Test
    public void addingComesAfter1stArg() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("+");

        assertEquals(null, model.getSecondArgument());
        assertEquals(CALC_OPER.ADD, model.getOperation());
    }

    @Test
    public void addingComesAfter1stArgAndAfter2nd() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("+");
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("+");

        assertEquals(new Double(2.2), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(CALC_OPER.ADD, model.getOperation());
    }

    @Test
    public void operationComesAfter1stArgAndAfter2ndArgAndThenSubstractionComes() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("/");
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("*");
        model.provideDigitForArgument("0");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("-");

        assertEquals(new Double(0.1), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(CALC_OPER.SUB, model.getOperation());
    }

    @Test
    public void usingExecution() {
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.provideOperation("+");
        model.provideDigitForArgument("1");
        model.provideDigitForArgument(".");
        model.provideDigitForArgument("1");
        model.execute();

        assertEquals(new Double(2.2), model.getFirstArgument());
        assertEquals(null, model.getSecondArgument());
        assertEquals(null, model.getOperation());
    }

 /*   @Test
    public void undoLastDigitFromArgument(){
        model.provideDigitForArgument("1");
        model.provideDigitForArgument("2");
        model.provideDigitForArgument("3");
        model.undoLastProvidedDigitFromArgument();

        assertEquals(new Double(12),model.getFirstArgument());
    }*/


}