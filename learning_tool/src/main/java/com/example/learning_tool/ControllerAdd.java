package com.example.learning_tool;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Objects;

public class ControllerAdd {

    private Dictionary model;

    public ControllerAdd() {
        this.model = new Dictionary();
    }

    @FXML
    private TextField addGer;

    @FXML
    private TextField addEng;

    @FXML
    private TextField addSol;

    @FXML
    private Label check;

    @FXML
    private Button add;

    @FXML
    private void addT() {
        model.addTranslation(addEng.getText(),addGer.getText(),addSol.getText());
        System.out.println("Translation added");
        check.setText("Translation added");
    }

}
