module com.programacion.calculadora {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.programacion.calculadora to javafx.fxml;
    exports com.programacion.calculadora;
}