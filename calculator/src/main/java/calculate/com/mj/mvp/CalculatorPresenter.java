package calculate.com.mj.mvp;

/**
 * Created by mj on 2015-06-30.
 */
public class CalculatorPresenter {

    private final CalculatorDisplay view;
    private final CalculatorModelGateway modelGateway;

    public CalculatorPresenter(CalculatorDisplay view, CalculatorModelGateway modelGateway) {
        this.view = view;
        this.modelGateway = modelGateway;
    }

    public void digitComes() {
        //TODO: provide methods
    }
}
