package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminLandingPageController {
    ControllerUtility utility = new ControllerUtility();

    @FXML
    private Button restockInventory;

    @FXML
    private Hyperlink editAccount;

    @FXML
    private Hyperlink signOut;

    @FXML
    private Hyperlink report1;

    @FXML
    public void restockInventoryPressed() throws IOException {
        Stage stage = (Stage) restockInventory.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/restock_inventory.fxml");
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

    @FXML
    public void report1Pressed(){
        //run report
        //open in new window
    }
}
