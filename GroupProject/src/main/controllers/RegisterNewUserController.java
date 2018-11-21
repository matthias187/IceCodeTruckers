package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import main.controllers.ControllerUtility;

import java.io.IOException;

public class RegisterNewUserController {
    private ControllerUtility utility = new ControllerUtility();

    @FXML
    private Button back;

    @FXML
    private Button submit;

    @FXML
    public void submitNewUser() throws IOException {
        //add user logic
        utility.back();
    }

    @FXML
    public void back() throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        utility.back();
    }
}
