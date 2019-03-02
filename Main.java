package sample;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.*;
import javafx.stage.*;
import javafx.application.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.geometry.*;
import javafx.scene.text.*;

public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    Stage stage;

    //Customer information
    TextField txtAddress;
    TextField txtPhone;
    TextField txtName;

    //Size Radio Buttons
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;

    //Crust Radio Buttons
    RadioButton rdoThin;
    RadioButton rdoThick;

    //Topping Radio Buttons
    CheckBox chkPepperoni;
    CheckBox chkSausage;
    CheckBox chkBeef;
    CheckBox chkMushrooms;
    CheckBox chkPineapple;
    CheckBox chkOnion;

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;

        //--Create the top pane--

        Text textHeading = new Text("Order Your Pizza Now!");
        textHeading.setFont(new Font(20));
        HBox paneTop = new HBox(textHeading);
        paneTop.setPadding(new Insets(20,10,20,10));

        //--Create the customer pane--
        //Create the name label and text field
        Label lblName = new Label("Name: ");
        txtName = new TextField();
        txtName.setPrefColumnCount(20);
        txtName.setPromptText("Enter customer's name.");
        txtName.setMaxWidth(Double.MAX_VALUE);
        HBox paneNAME = new HBox(lblName, txtName);

        //Create the phone label and text field
        Label lblPhone = new Label("Phone: ");
        txtPhone = new TextField();
        txtPhone.setPrefColumnCount(20);
        txtPhone.setPromptText("Enter customer's phone.");
        txtPhone.setMaxWidth(Double.MAX_VALUE);
        HBox panePhone = new HBox(lblPhone, txtPhone);

        //Create the address label and text field
        Label lblAddress = new Label("Address: ");
        txtAddress = new TextField();
        txtAddress.setPrefColumnCount(20);
        txtAddress.setPromptText("Enter customer's address.");
        txtAddress.setMaxWidth(Double.MAX_VALUE);
        HBox paneAddress = new HBox(lblAddress, txtAddress);

        
    }
}