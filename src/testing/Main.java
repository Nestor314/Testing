package testing;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Вхід в систему");

        // Створюємо кореневий вузол з фоном
        StackPane root = new StackPane();
        root.getStyleClass().add("root");

        // Створюємо сітку для розташування елементів управління
        GridPane grid = new GridPane();
        grid.getStyleClass().add("login-pane");
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(40, 40, 40, 40));

        // Додаємо мітку для заголовка
        Label titleLabel = new Label("Вхід в систему");
        titleLabel.getStyleClass().add("login-title");
        grid.add(titleLabel, 0, 0, 2, 1); // Розташування на дві колонки

        // Додаємо мітку та поле введення для пошти
        Label emailLabel = new Label("Email:");
        TextField emailTextField = new TextField();
        emailTextField.getStyleClass().add("login-text-field");
        grid.add(emailLabel, 0, 1);
        grid.add(emailTextField, 1, 1);

        // Додаємо мітку та поле введення для пароля
        Label passwordLabel = new Label("Пароль:");
        PasswordField passwordField = new PasswordField();
        passwordField.getStyleClass().add("login-text-field");
        grid.add(passwordLabel, 0, 2);
        grid.add(passwordField, 1, 2);

        // Додаємо кнопку для відправлення даних
        Button loginButton = new Button("Увійти");
        loginButton.getStyleClass().add("login-button");
        grid.add(loginButton, 1, 3);

        // Додаємо кнопку "Зареєструватися"
        Button registerButton = new Button("Зареєструватися");
        registerButton.getStyleClass().add("register-button");
        grid.add(registerButton, 2, 3);

        // Обробник події для кнопки "Увійти"
        loginButton.setOnAction(event -> {
            String email = emailTextField.getText();
            String password = passwordField.getText();
            System.out.println("Електронна пошта: " + email + "\nПароль: " + password);
            // Тут можна додати код для обробки введених даних
        });

        // Обробник події для кнопки "Зареєструватися"
        registerButton.setOnAction(event -> {
            // Тут можна додати код для обробки події "Зареєструватися"
        });

        // Додаємо сітку на кореневий вузол
        root.getChildren().add(grid);

        // Створюємо сцену і встановлюємо її на основі кореневого вузла
        Scene scene = new Scene(root, 500, 400); // Збільшимо розміри вікна
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm()); // Підключаємо CSS
        primaryStage.setScene(scene);

        // Відображаємо вікно
        primaryStage.show();
    }
}
