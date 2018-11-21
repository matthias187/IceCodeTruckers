package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class PlaceOrderController {
    @FXML
    private Button placeOrder;
    @FXML
    private Button back;
    @FXML
    private Hyperlink signOut;


    private ControllerUtility utility = new ControllerUtility();

    @FXML
    public void placeOrderPressed() throws IOException {
        Stage stage = (Stage) placeOrder.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/confirmation.fxml");
    }

    @FXML
    public void signOutPressed() throws IOException {
        Stage stage = (Stage) signOut.getScene().getWindow();
        // log out logic
        utility.loadNewFXML(stage, "../fxmls/login.fxml");
    }

    @FXML
    public void backPressed() throws IOException {
        Stage stage = (Stage) back.getScene().getWindow();
        // log out logic
        utility.back();
    }
}
