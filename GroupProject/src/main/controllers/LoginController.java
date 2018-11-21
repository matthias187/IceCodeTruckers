package main.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {


    @FXML
    private Button login;
    @FXML
    private Hyperlink registerNewUser;

    private ControllerUtility utility = new ControllerUtility();

    @FXML
    public void registerNewUserPressed() throws IOException {
        Stage stage = (Stage) registerNewUser.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/register_new_user.fxml");
    }

    @FXML
    public void loginPressed() throws IOException {
        Stage stage = (Stage) login.getScene().getWindow();
        //if user is non-admin{
            utility.loadNewFXML(stage, "../fxmls/user_landing_page.fxml");
        //else if user is admin
            //utility.loadNewFXML(stage, "admin_landing_page.fxml");
    }

}

