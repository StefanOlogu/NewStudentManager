module com.example.newstudentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newstudentmanager to javafx.fxml;
    exports com.example.newstudentmanager;
}