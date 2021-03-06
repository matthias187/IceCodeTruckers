package main.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.DatabaseUtility;
import main.Main;
import main.User;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {

    @FXML
    private Button login;
    @FXML
    private Hyperlink registerNewUser;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;

    private ControllerUtility utility = new ControllerUtility();
    private DatabaseUtility dbUtility = new DatabaseUtility();

    @FXML
    public void registerNewUserPressed() throws IOException {
        Stage stage = (Stage) registerNewUser.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/register_new_user.fxml");
    }

    @FXML
    public void loginPressed() throws IOException, SQLException {
        Stage stage = (Stage) login.getScene().getWindow();
        DatabaseUtility dbUtil = new DatabaseUtility();
        String query = "SELECT * FROM User WHERE UserName=\'"+username.getText()+"\';";
        ResultSet getUser = dbUtil.queryDatabase(query);
        if (!getUser.next()) {
            utility.showAlert("Authentication Error", "That username doesn't exist!");
        }
        else if (!getUser.getString(9).equals(password.getText())){
            utility.showAlert("Authentication Error", "Incorrect password!");
        }
        else if(getUser.getString(7).equals("T")){
            dbUtil.currentUser = new User(getUser.getInt(1), getUser.getString(2), getUser.getString(3), getUser.getString(8), getUser.getString(9), "", true);
            utility.loadNewFXML(stage, "../fxmls/admin_landing_page.fxml");
        }
        else if(getUser.getString(7).equals("F")) {
            dbUtil.currentUser = new User(getUser.getInt(1), getUser.getString(2), getUser.getString(3), getUser.getString(8), getUser.getString(9), "", false);
            utility.loadNewFXML(stage, "../fxmls/user_landing_page.fxml");
        } else {
            utility.showAlert("Authentication Error", "Please enter a valid username and password");
        }
    }

}

