module com.ilyap.planner {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.ilyap.planner to javafx.fxml, javafx.controls;
    exports com.ilyap.planner;

    opens com.ilyap.planner.controllers to javafx.fxml, javafx.controls;
    exports com.ilyap.planner.controllers;

    opens com.ilyap.planner.utils to javafx.fxml, javafx.controls;
    exports com.ilyap.planner.utils;
}