module com.example.learning_tool {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learning_tool to javafx.fxml;
    exports com.example.learning_tool;
}