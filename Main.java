package Task1;

import java.util.Scanner;

// Главный класс приложения
public class Main {
    public static void main(String[] args) {
// Создание экземпляров модели, представления и презентера
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        // Обработка действия пользователя (например, нажатие кнопки "Сложить")
        presenter.onAddButtonClicked();
    }
}