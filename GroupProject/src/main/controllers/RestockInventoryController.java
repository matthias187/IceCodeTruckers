package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class RestockInventoryController {

    ControllerUtility utility = new ControllerUtility();

    @FXML
    public Button backs;

    @FXML
    public Button submitOrder;

    @FXML
    public void backPressed() throws IOException {
        Stage stage = (Stage) backs.getScene().getWindow();
        utility.back();
    }

    @FXML
    public void submitPressed() throws IOException {
        Stage stage = (Stage) submitOrder.getScene().getWindow();
        //submit order logic
        utility.loadNewFXML(stage, "../fxmls.confirmation.fxml");
    }
}
