module com.example.tipcalculator1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tipcalculator1 to javafx.fxml;
    exports com.example.tipcalculator1;
}