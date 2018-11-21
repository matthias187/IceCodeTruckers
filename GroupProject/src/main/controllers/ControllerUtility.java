package main.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import main.Main;

import java.io.IOException;
import java.util.Stack;

public class ControllerUtility {

    public ControllerUtility(){
        if (fxmlsLoaded.size() == 0){
            fxmlsLoaded.push("../fxmls/login.fxml");
        }
    }

    protected static Stack<String> fxmlsLoaded = new Stack<>();


    public void back() throws IOException {
        fxmlsLoaded.pop();
        Parent root = FXMLLoader.load(getClass().getResource(fxmlsLoaded.pop()));
        Scene scene = new Scene(root, Main.MENU_WIDTH, Main.MENU_HEIGHT);
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    public void loadNewFXML(Stage stage, String fxml) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxml));
        Scene scene = new Scene(root, Main.MENU_WIDTH, Main.MENU_HEIGHT);
        stage.setScene(scene);
        fxmlsLoaded.push(fxml);
        stage.show();
    }
}
