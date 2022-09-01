package com.example.learning_tool;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Dictionary model;
    Translation randomEx;

    public Controller() {
        this.model = new Dictionary();
        this.randomEx = model.selectRandomTranslation();
    }

    @FXML
    private Button submit;

    @FXML
    private Button add;

    @FXML
    private Label englishL;

    @FXML
    private Label germanL;

    @FXML
    private TextField input;

    @FXML
    private Label checkL;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        germanL.setText(randomEx.getGerman());
        englishL.setText(randomEx.getEnglish());

    }

    @FXML
    private void submit() {
        System.out.println("submit");
        String randomSol = randomEx.getSolution();
        if (Objects.equals(input.getText(), randomSol)) {
            System.out.println("true");
            checkL.setText("Correct answer");
            randomEx = model.selectRandomTranslation();
            englishL.setText(randomEx.getGerman());
            germanL.setText(randomEx.getEnglish());
        } else {
            System.out.println("false");
            checkL.setText("Wrong answer");
        }
    }

    @FXML
    private void add() throws IOException {
        System.out.println("add");
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("add-view.fxml"));
        Parent root = fxmlLoader.load();
        ControllerAdd controllerAdd = fxmlLoader.getController();
        Stage stageAdd = new Stage();
        stageAdd.setScene(new Scene(root));
        //stageAdd.initOwner(stage);
        stageAdd.setTitle("Add Translation");
        stageAdd.showAndWait();
    }

}