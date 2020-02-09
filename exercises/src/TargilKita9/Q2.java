package TargilKita9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Q2 extends Application {
    private static final double MAX = 50;
    private static final double MIN = 2;
    private BorderPane pane = new BorderPane();

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
            pane.requestFocus();
        });

        pane.setCenter(text);
        pane.setBottom(button);
        pane.setPadding(new Insets(40));
        pane.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.UP && text.getFont().getSize() < MAX)
                text.setFont(Font.font(text.getFont().getSize() + 2));
            else if (e.getCode() == KeyCode.DOWN && text.getFont().getSize() > MIN)
                text.setFont(Font.font(text.getFont().getSize() - 2));
        });
        pane.requestFocus();
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.setTitle("MYPANE");
        primaryStage.show();

    }

}
