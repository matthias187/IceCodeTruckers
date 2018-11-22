package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class UserLandingPageController {

    @FXML
    private Button placeNewOrder;
    @FXML
    private Hyperlink signOut;
    @FXML
    private Hyperlink editAccount;

    private ControllerUtility utility = new ControllerUtility();

    @FXML
    public void placeNewOrderPressed() throws IOException {
        Stage stage = (Stage) placeNewOrder.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/place_order.fxml");
    }

    @FXML
    public void signOutPressed() throws IOException {
        Stage stage = (Stage) signOut.getScene().getWindow();
        // log out logic
        utility.loadNewFXML(stage, "../fxmls/login.fxml");
    }

    @FXML
    public void editAccountPressed() throws IOException {
        Stage stage = (Stage) editAccount.getScene().getWindow();
        // log out logic
        utility.loadNewFXML(stage, "../fxmls/edit_user.fxml");
    }
}