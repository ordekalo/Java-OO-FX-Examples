package TargilKita9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q1 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Text text = new Text("JAVA IS COOL MAN!");
        Button button = new Button("OK");
        button.setDefaultButton(true);
        button.setOnAction(e -> {
            text.setFill(Color.RED);
        });
        BorderPane pane = new BorderPane(text);
        pane.setBottom(button);
        pane.setPadding(new Insets(40));
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.show();

    }

}
