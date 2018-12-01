package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import main.DatabaseUtility;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterNewUserController {
    private ControllerUtility utility = new ControllerUtility();

    @FXML
    private Button cancel;
    @FXML
    private Button submit;
    @FXML
    private TextField username;
    @FXML
    private TextField password;
    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private TextField emailAddress;
    @FXML
    private TextField country;
    @FXML
    private TextField streetNumber;
    @FXML
    private TextField unitNumber;
    @FXML
    private TextField streetName;
    @FXML
    private TextField city;
    @FXML
    private TextField state;
    @FXML
    private TextField zip;
    @FXML
    private TextField creditCardNumber;
    @FXML
    private TextField paymentCountry;
    @FXML
    private TextField paymentStreetNumber;
    @FXML
    private TextField paymentUnitNumber;
    @FXML
    private TextField paymentStreetName;
    @FXML
    private TextField paymentCity;
    @FXML
    private TextField paymentState;
    @FXML
    private TextField paymentZip;
    @FXML
    private MenuButton cardType;
    @FXML
    private MenuButton cardExpirationMonth;
    @FXML
    private MenuButton cardExpirationYear;
    @FXML
    private CheckBox sameAsShipping;

    @FXML
    public void submitNewUser() throws IOException, SQLException {
        if( username.getText().equals("") || password.getText().equals("")){
            utility.showAlert("Registration Error", "You must enter a username and password!");
        }
        DatabaseUtility dbUtil = new DatabaseUtility();
        String query = "SELECT * FROM User WHERE UserName=\'"+username.getText()+"\';";
        ResultSet getUser = dbUtil.queryDatabase(query);
        String createUser = "INSERT INTO User (FirstName, LastName, Street, City, Phone, isAdmn, UserName, Password) VALUES (\'"+firstName.getText()+"\', \'"+lastName.getText()+"\', \'"+streetName.getText()+"\', \'"+city.getText()+"\', 1112223333, 'F', \'"+username.getText()+"\', \'"+password.getText()+"\');";
        String payment = "INSERT INTO User (FirstName, LastName, Street, City, Phone, isAdmn, UserName, Password) VALUES ('test1', 'test1', 'testStreet', 'tesyCity', 1112223333, 'F', 'user', 'password');";
        if (getUser.next()) {
            utility.showAlert("Registration Error", "That username already exists!");
        } else {
            dbUtil.insertDatabase(createUser);
            utility.back();
        }
    }

    @FXML
    public void back() throws IOException {
        utility.back();
    }
}
