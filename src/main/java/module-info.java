module com.example.calculadoracss {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadoracss to javafx.fxml;
    exports com.example.calculadoracss;
}