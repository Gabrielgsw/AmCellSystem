module br.com.amcell.amcellsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;

    opens br.com.amcell.amcellsystem to javafx.fxml;
    exports br.com.amcell.amcellsystem;
}