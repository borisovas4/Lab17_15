module com.example.lab17_14 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab17_14 to javafx.fxml;
    exports com.example.lab17_14;
}