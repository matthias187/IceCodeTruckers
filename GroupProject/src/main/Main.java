package main;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application
{
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Ice Code Truckers");

        Button login = new Button("Log In");
        login.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //Do login stuff
            }
        });

        BorderPane layout = new BorderPane();
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10, 50, 50, 50));
        TextField username = new TextField();
        username.setPromptText("Username");
        TextField password = new TextField();
        password.setPromptText("Password");

        //Set initial focus to the login button
        Platform.runLater(() -> login.requestFocus());
        vbox.setAlignment(Pos.CENTER);
        vbox.getChildren().add(username);
        vbox.getChildren().add(password);
        vbox.getChildren().add(login);
        layout.setRight(vbox);
        Scene scene = new Scene(layout, 1024, 640);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
