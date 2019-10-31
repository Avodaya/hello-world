package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.StackPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Main extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    Button przycisk;

    @Override
    public void start(Stage primaryStage) throws Exception{
       // Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        przycisk = new Button("Klkinij");
        przycisk.setOnAction(this);

        StackPane  layout = new StackPane();
        layout.getChildren().add(przycisk);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(layout, 300, 275));
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource()==przycisk) {
            System.out.print("nacisnieto guziczek");
        }
    }
}
