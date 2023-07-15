package Task1;

// Презентер (Presenter)
public class CalculatorPresenter {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        double number1 = view.getUserInput();
        char ch = view.getUserInputChar();
        double number2 = view.getUserInput();

        model.add(number1, number2, ch);
        double result = model.getResult();

        view.displayResult(result);
    }
}
