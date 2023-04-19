module com.java.javaproject2_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java.javaproject2_1 to javafx.fxml;
    exports com.java.javaproject2_1;
}