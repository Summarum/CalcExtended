package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.NumberStringConverter;

import java.awt.event.KeyEvent;
import java.util.function.UnaryOperator;

/**
 * Created by ryoukou on 4/14/17.
 */
public class CalcTemplateController {
    @FXML
    private TextField textFieldMain;


    UnaryOperator<TextFormatter.Change> filter = change -> {
        String text = change.getText();

        if (text.matches("[0-9]*")) {
            return change;
        }

        return null;
    };
    @FXML
    public void initialize() {
        TextFormatter<String> textFormatter = new TextFormatter<>(filter);
        textFieldMain.setTextFormatter(textFormatter);
    }

    public void text_checker(){

    //System.out.println("");
}


    public void btn_1_click(){
        textFieldMain.appendText(1+"");
    }

}
