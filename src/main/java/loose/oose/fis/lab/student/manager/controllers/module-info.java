module com.example.newstudentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens loose.oose.fis.lab.student.manager.controllers.da to javafx.fxml;
    exports loose.oose.fis.lab.student.manager.controllers.da;
}