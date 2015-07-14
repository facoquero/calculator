package calculate.com.wo.presenter;

import calculate.com.wo.ui.CalculatorView;
import calculate.com.wo.model.*;
import calculate.com.wo.ui.actionlisteners.*;


public class CalculatorPresenter implements Presenter
{

    CalculatorView theView;
    CalculatorModel theModel;

    public CalculatorPresenter(CalculatorView theView, CalculatorModel theModel)
    {
        this.theModel = theModel;
        this.theView = theView;


        this.theView.addPercentListener( new PercentListener() );
        this.theView.addACListener( new ACListener() );
        this.theView.addCListener( new CListener() );
        this.theView.addDivListener( new DivListener() );
        this.theView.addMultListener( new MultListener() );
        this.theView.addPlusListener( new PlusListener() );
        this.theView.addMinusListener( new MinusListener() );
        this.theView.addPlusMinusListener( new PlusMinusListener() );
        this.theView.addEqualsListener( new EqualsListener() );
        this.theView.addDotListener( new DotListener() );

        this.theView.addEightListener( new EightListener() );
        this.theView.addNineListener( new NineListener() );
        this.theView.addSevenListener( new SevenListener() );
        this.theView.addFiveListener( new FiveListener() );
        this.theView.addFourListener( new FourListener() );
        this.theView.addSixListener( new SixListener() );
        this.theView.addThreeListener( new ThreeListener() );
        this.theView.addTwoListener( new TwoListener() );
        this.theView.addOneListener( new OneListener() );
        this.theView.addZeroListener( new ZeroListener() );

    }
}
