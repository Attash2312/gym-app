package com.example.gymapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void equipmentpage() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view-equipment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloApplication.window.setScene(scene);
        HelloApplication.window.show();
    }
}