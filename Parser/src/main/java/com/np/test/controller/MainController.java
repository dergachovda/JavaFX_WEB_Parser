package com.np.test.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField input;

    @FXML
    private Button btPars;

    @FXML
    private Label output;

    @FXML
    public void initialize(){
        btPars.setOnAction(event -> {
            System.out.println("Button click");
            if (input.getText().isEmpty()) {
                output.setText("Input field is empty!");
            } else {
                output.setText(input.getText());
            }
        });
    }
}

