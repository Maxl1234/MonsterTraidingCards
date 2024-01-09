module com.example.cardtraidinggame {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cardtraidinggame to javafx.fxml;
    exports com.example.cardtraidinggame;
}