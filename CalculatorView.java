package Task1;

import java.util.Scanner;

// Представление (View)
public class CalculatorView {
    public void displayResult(double result) {

        System.out.println("Результат: " + result);
    }

    public double getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double input = scanner.nextDouble();
        return input;
    }
    public char getUserInputChar(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите действие(+, -, *, /): ");
        String tmp = scanner.next();
        char ch = tmp.charAt(tmp.length()-1);
        return ch;
    }
}
