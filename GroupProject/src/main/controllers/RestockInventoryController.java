package main.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RestockInventoryController {

    ControllerUtility utility = new ControllerUtility();

    @FXML
    private Button cancel;

    @FXML
    private Button submitOrder;

    MenuItem menuItem1 = new MenuItem("Item 1");
    MenuItem menuItem2 = new MenuItem("Item 2");
    MenuItem menuItem3 = new MenuItem("Item 3");
    @FXML
    private MenuButton restockItem =new MenuButton();

    @FXML
    private TextField quantity;

    @FXML
    public void cancelPressed() throws IOException {
        utility.back();
    }

    @FXML
    public void submitPressed() throws IOException {
        Stage stage = (Stage) submitOrder.getScene().getWindow();
        //submit order logic
        utility.loadNewFXML(stage, "../fxmls/confirmation.fxml");
    }
}
