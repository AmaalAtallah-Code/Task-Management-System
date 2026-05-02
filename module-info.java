module com.amaal.taskmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.amaal.taskmanager to javafx.fxml;
    exports com.amaal.taskmanager;
}