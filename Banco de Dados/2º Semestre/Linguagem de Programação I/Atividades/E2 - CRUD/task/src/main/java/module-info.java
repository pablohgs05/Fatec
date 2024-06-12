module ex1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens ex1 to javafx.fxml;
    exports ex1;
}
