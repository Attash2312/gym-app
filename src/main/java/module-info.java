module com.example.gymapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gymapp to javafx.fxml;
    exports com.example.gymapp;
}