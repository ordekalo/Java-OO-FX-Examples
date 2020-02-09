package setOnActionExample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Example1 extends Application {
    private Circle c = new Circle(70);

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {

        Button button = new Button("GO!");
        button.setOnAction(new ChangeFill());
        HBox hbox = new HBox(button);
        hbox.setPadding(new Insets(30));
        Pane pane = new StackPane(c, hbox);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    private class ChangeFill implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        }

    }

}
