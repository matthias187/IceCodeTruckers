package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import main.DatabaseUtility;
import main.User;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EditUserController {

    private ControllerUtility utility = new ControllerUtility();
    private DatabaseUtility dbUtility = new DatabaseUtility();

    @FXML
    private Button cancel;
    @FXML
    private Button submitUpdate;
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

    public void initialize(){
        User currentUser = dbUtility.getCurrentUser();
        username.setText(currentUser.getUserName());
        password.setText(currentUser.getPassword());
        firstName.setText(currentUser.getFirsName());
        lastName.setText(currentUser.getLastName());

    }

    @FXML
    public void submitUpdateUser() throws IOException, SQLException {
        if( username.getText().equals("") || password.getText().equals("")){
            utility.showAlert("Update Error", "You must enter a username and password!");
        }
        DatabaseUtility dbUtil = new DatabaseUtility();
        String query = "SELECT * FROM User WHERE UserID=\'"+dbUtil.getCurrentUser().getUserID()+"\';";
        ResultSet getUser = dbUtil.queryDatabase(query);
        String updateUser = "UPDATE User SET FirstName = \'"+firstName.getText()+"\', LastName = \'"+lastName.getText()+"\', Street = \'"+streetName.getText()+"\', City = \'"+city.getText()+"\', UserName = \'"+username.getText()+"\', Password = \'"+password.getText()+"\' WHERE UserID = \'"+dbUtil.getCurrentUser().getUserID()+"\'";
        String payment = "INSERT INTO User (FirstName, LastName, Street, City, Phone, isAdmn, UserName, Password) VALUES ('test1', 'test1', 'testStreet', 'tesyCity', 1112223333, 'F', 'user', 'password');";
        if (getUser.next() && !dbUtility.getCurrentUser().getUserName().equals(getUser.getString(8))) {
            utility.showAlert("Update Error", "That username already exists!");
        } else {
            dbUtil.insertDatabase(updateUser);
            dbUtil.getCurrentUser().setUserName(username.getText());
            dbUtil.getCurrentUser().setFirstName(firstName.getText());
            dbUtil.getCurrentUser().setLastName(lastName.getText());
            utility.showAlert("Update Accepted", "Update Successful!!");
            utility.back();
        }
    }

    @FXML
    public void cancel() throws IOException {
        Stage stage = (Stage) cancel.getScene().getWindow();
        utility.back();
    }

    @FXML
    public void setSameAsShipping(){
        //add logic here
    }
}
