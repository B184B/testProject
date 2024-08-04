module ku.cs.projectjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    exports ku.cs.project;
    opens ku.cs.project to javafx.fxml;
    exports ku.cs.controllers;
    opens ku.cs.controllers to javafx.fxml;
    exports ku.cs.services;
    opens ku.cs.services to javafx.fxml;
}