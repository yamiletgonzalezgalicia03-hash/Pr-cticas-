module com.yamigg.practicadinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.yamigg.practicadinero to javafx.fxml;
    exports com.yamigg.practicadinero;
}
