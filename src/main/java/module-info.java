module com.example.clientegestor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.clientegestor to javafx.fxml;
    exports com.example.clientegestor;
    opens com.example.clientegestor.controller to javafx.fxml;
    exports com.example.clientegestor.controller;
}