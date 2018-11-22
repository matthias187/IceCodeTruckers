package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class ConfirmationController {
    @FXML
    private Button returnHome;
    @FXML
    private Hyperlink signOut;


    private ControllerUtility utility = new ControllerUtility();

    @FXML
    public void returnHomePressed() throws IOException {
        Stage stage = (Stage) returnHome.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/user_landing_page.fxml");
        //utility.loadNewFXML(stage, "../fxmls/admin_landing_page.fxml");
    }

    @FXML
    public void signOutPressed() throws IOException {
        Stage stage = (Stage) signOut.getScene().getWindow();
        // log out logic
        utility.loadNewFXML(stage, "../fxmls/login.fxml");

    }
}
