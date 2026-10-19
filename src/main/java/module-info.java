module com.yamigg.practicaedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.yamigg.practicaedad to javafx.fxml;
    exports com.yamigg.practicaedad;
}
