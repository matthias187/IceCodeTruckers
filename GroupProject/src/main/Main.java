package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;


public class Main extends Application
{
    public static int MENU_WIDTH = 1024;
    public static int MENU_HEIGHT = 640;
    public static Stage stage;
    public static void main( String[] args )
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.stage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("fxmls/login.fxml"));
        Scene scene = new Scene(root, MENU_WIDTH, MENU_HEIGHT);
        primaryStage.setTitle("Ice Code Truckers");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void loadNewFXML(Stage stage, String fxml){

    }
}
