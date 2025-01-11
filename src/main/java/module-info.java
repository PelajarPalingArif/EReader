module main {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.astar to javafx.fxml;
    opens com.astar.controller to javafx.fxml;
    exports com.astar;
}