package main.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import main.DatabaseUtility;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Comparator;

public class PlaceOrderController {

    private final ObservableList<Integer> quantities =
            FXCollections.observableArrayList(0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);
    @FXML
    private Button placeOrder;
    @FXML
    private Button back;
    @FXML
    private Hyperlink signOut;
    @FXML
    private ComboBox vanillaQuant;
    @FXML
    private ComboBox chocolateQuant;
    @FXML
    private ComboBox strawberryQuant;



    private ControllerUtility utility = new ControllerUtility();
    private DatabaseUtility dbUtil = new DatabaseUtility();


    @FXML
    void initialize(){
        vanillaQuant.getItems().clear();
        chocolateQuant.getItems().clear();
        strawberryQuant.getItems().clear();
        vanillaQuant.setItems(quantities);
        chocolateQuant.setItems(quantities);
        strawberryQuant.setItems(quantities);
        vanillaQuant.getSelectionModel().selectFirst();
        chocolateQuant.getSelectionModel().selectFirst();
        strawberryQuant.getSelectionModel().selectFirst();

    }

    @FXML
    public void placeOrderPressed() throws IOException, SQLException {
        int vanillaQuant = (int) this.vanillaQuant.getValue();
        int chocolateQuant = (int) this.chocolateQuant.getValue();
        int strawberry = (int) this.strawberryQuant.getValue();
        String placeOrderInsert = "INSERT INTO Orders (Customer_ID, Customer_name) VALUES ("+ dbUtil.getCurrentUser().getUserID()+ ", \'"+ dbUtil.getCurrentUser().getFirsName()+" "+dbUtil.getCurrentUser().getLastName()+"\');";
        dbUtil.insertDatabase(placeOrderInsert);
        utility.showAlert("Order Confirmation", "Your order has been successfully placed!");
        Stage stage = (Stage) placeOrder.getScene().getWindow();
        utility.loadNewFXML(stage, "../fxmls/user_landing_page.fxml");
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
