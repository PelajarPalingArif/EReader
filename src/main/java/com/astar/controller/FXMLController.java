package com.astar.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
    @FXML
    private Label label;

    public void initialize() {
        String helloWorld = "HelloWorld";
        label.setText(helloWorld);
    }

}
