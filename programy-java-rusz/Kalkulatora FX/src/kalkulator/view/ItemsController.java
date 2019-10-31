package kalkulator.view;

import javafx.fxml.FXML;
import kalkulator.Main;

public class ItemsController {

    private Main main;

    @FXML
    private void numberPressed() {

        main.insertNumber();
    }
}
