package Task1;

// Модель (Model)
public class CalculatorModel {
    private double result;

    public void add(double number1, double number2, char ch) {
        if(ch == '+'){
            result = number1 + number2;
        } else if (ch == '-') {
            result = number1 - number2;
        } else if (ch == '*') {
            result = number1 * number2;
        } else if (ch == '/'){
            if (number2 == 0){
                result =  0;
            }
            result = number1 / number2;
        } else result = 0;
    }

    public double getResult() {

        return result;
    }
}
