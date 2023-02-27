/**
 * Midterm Exam - Tip Calculator
 * Object-Oriented Programming 2 (420-PO2-ID)
 * Student: Victor Hugo Motta Machado (ID: 653227967)
 * Instructor: Yves Desharnais
 * Date: 23 February 2023
 */
package com.example.tipcalculator1;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TipCalculator1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root =
                FXMLLoader.load(getClass().getResource("TipCalculator1.fxml"));

        Scene scene = new Scene(root);
        stage.setTitle("Tip Calculator");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}