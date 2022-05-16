module com.example.baekjoon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baekjoon to javafx.fxml;
    exports com.example.baekjoon;
}