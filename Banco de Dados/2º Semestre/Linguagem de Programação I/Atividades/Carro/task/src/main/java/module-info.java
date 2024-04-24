module ex1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens ex1 to javafx.fxml;
    exports ex1;
}
