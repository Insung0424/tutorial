module com.example.objectmapper {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.fasterxml.jackson.databind;


    opens com.example.objectmapper to javafx.fxml;
    exports com.example.objectmapper;
}