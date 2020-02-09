package TargilKita8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Q4 extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new StackPane();

        for (int i = 1; i <= 9; i++) {
            Circle c = new Circle(i * 15);
            c.setFill(Color.TRANSPARENT);
            c.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            c.setStrokeWidth(7);
            pane.getChildren().add(c);
        }

        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Q3");
        primaryStage.centerOnScreen();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(true);
        primaryStage.show();
    }

}
