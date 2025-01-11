module main {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.astar to javafx.fxml;
    exports com.astar;
}