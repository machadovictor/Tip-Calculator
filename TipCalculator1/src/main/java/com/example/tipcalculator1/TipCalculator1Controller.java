/**
 * Midterm Exam - Tip Calculator
 * Object-Oriented Programming 2 (420-PO2-ID)
 * Student: Victor Hugo Motta Machado (ID: 653227967)
 * Instructor: Yves Desharnais
 * Date: 23 February 2023
 */
package com.example.tipcalculator1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class TipCalculator1Controller {
    @FXML
    private Label amountLabel;

    @FXML
    private Label amountTip;

    @FXML
    private TextField amountValue;

    @FXML
    private RadioButton btn15;

    @FXML
    private RadioButton btn20;

    @FXML
    private Button btnCalculate;

    @FXML
    private AnchorPane mainPanel;

    @FXML
    private Label rateLabel;

    @FXML
    private Label tipValue;

    @FXML
    void calculateButtonPressed(ActionEvent event){
        if (!Character.isDigit(amountValue.getText().charAt(0))) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setContentText("Invalid input!");
            alert.showAndWait();
            return;
        }

        double amount = Double.parseDouble(amountValue.getText());

        // Calcula a tip
        double tip;
        if (btn15.isSelected()) {
            tip = amount * 0.15;
        } else if (btn20.isSelected()) {
            tip = amount * 0.20;
        } else {
            return; // Nenhum botão foi selecionado
        }

        // Define o valor da tipValue
        tipValue.setText(String.format("%.2f", tip));
    }
}
