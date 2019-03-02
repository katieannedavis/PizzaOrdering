package sample;

import javafx.application.*;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.geometry.*;

public class Main extends Application{
    public static void main(String[] args){
        launch(args);
    }

    Stage stage;
    TextField txtAddress;
    RadioButton rdoSmall;
    RadioButton rdoMedium;
    RadioButton rdoLarge;
    RadioButton rdoThin;
    RadioButton rdoThick;

    @Override
    public void start(Stage primaryStage){
        stage = primaryStage;

        //Create grid for Name, Phone, and Address textfields
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10,10,10,10));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setMinWidth(500);
        grid.setPrefWidth(500);
        grid.setMaxWidth(800);
        
        // Create and add the name label and text field
        Label lblName = new Label("Name: ");
        final TextField txtName = new TextField();
        txtName.setPromptText("Enter your name.");
        GridPane.setConstraints(lblName, 0,1);
        GridPane.setConstraints(txtName,1,1);


        // Create the phone number label and text field
        Label lblphone = new Label("Phone Number: ");
        final TextField txtPhone = new TextField();
        txtName.setPromptText("Enter your phone number.");
        GridPane.setConstraints(lblphone, 0, 2);
        GridPane.setConstraints(txtPhone, 1,2);


        //Create the scene and the stage
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pizza Order");
        primaryStage.setMinWidth(500);
        primaryStage.setMaxWidth(900);
        primaryStage.show();
    }
}