module com.example.ioc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ioc to javafx.fxml;
    exports com.example.ioc;
}