package TargilKita8;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Q2 extends Application {

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        tf1.setStyle("-fx-border-color:red; -fx-border-width: 4; -fx-text-fill: red;  -fx-background-color: powderblue; -fx-font-weight: bold");
        Pane pane = new VBox(30, tf1, tf2);
        pane.setPadding(new Insets(50));
        Scene scene = new Scene(pane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Q2");
        primaryStage.centerOnScreen();
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
