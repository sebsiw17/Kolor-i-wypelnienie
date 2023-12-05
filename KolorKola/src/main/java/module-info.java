module com.example.kolorkola {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kolorkola to javafx.fxml;
    exports com.example.kolorkola;
}