package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextFormatter;
import javafx.util.converter.IntegerStringConverter;
import javafx.util.converter.NumberStringConverter;

import javax.xml.soap.Text;
import java.awt.event.KeyEvent;
import java.util.function.UnaryOperator;

/**
 * Created by ryoukou on 4/14/17.
 */
public class CalcTemplateController {
    @FXML
    private TextField textFieldMain;

    @FXML
    private TextField resultTextField;

    private double var_A, var_B, result; //variables for calculus along with result
    private int operationType; // contains lastly used operation


    //tests if character typed into text field is a number or ".". If number already contains "." then makes it impossible to add another dot.
    UnaryOperator<TextFormatter.Change> filter = change -> {
        String text = change.getText();

        if (text.matches("[0-9]*") || (text.matches("[.]")&& !textFieldMain.getText().contains(".")) ) {
            return change;
        }

        return null;
    };
    @FXML
    public void initialize() {
        TextFormatter<String> textFormatter = new TextFormatter<>(filter);
        textFieldMain.setTextFormatter(textFormatter);
        resultTextField.setVisible(false);
    }




    public void btn_1_click(){

        textFieldMain.appendText(1+"");
    }
    public void btn_2_click(){

        textFieldMain.appendText(2+"");
    }
    public void btn_3_click(){

        textFieldMain.appendText(3+"");
    }
    public void btn_4_click(){

        textFieldMain.appendText(4+"");
    }
    public void btn_5_click(){

        textFieldMain.appendText(5+"");
    }
    public void btn_6_click(){

        textFieldMain.appendText(6+"");
    }
    public void btn_7_click(){

        textFieldMain.appendText(7+"");
    }
    public void btn_8_click(){

        textFieldMain.appendText(8+"");
    }
    public void btn_9_click(){

        textFieldMain.appendText(9+"");
    }
    public void btn_0_click(){

        textFieldMain.appendText(0+"");
    }
    public void btn_del_click(){
        var_A = 0.0;
        result = 0.0;
        textFieldMain.clear();
        resultTextField.clear();
        resultTextField.setVisible(false);

    }
    private double sumDoubles(){
        result = var_A + var_B;
        return result;
    }
    public void btn_add_click(){
        if(var_A == 0.0 && textFieldMain.getLength() > 0){
            var_A = Double.parseDouble(textFieldMain.getText());
            resultTextField.setVisible(true);
            resultTextField.setText(var_A+"");
            textFieldMain.clear();

        }else
        if(var_A != 0.0 && var_B == 0.0 && textFieldMain.getLength() > 0) {
            var_B = Double.parseDouble(textFieldMain.getText());
            textFieldMain.clear();
            resultTextField.setText(sumDoubles() + "");
            //System.out.println(result);

        }else
        if (var_A != 0.0 && var_B != 0.0&& textFieldMain.getLength() > 0){
            var_A = result;
            var_B = Double.parseDouble(textFieldMain.getText());
            textFieldMain.clear();
            resultTextField.setText(sumDoubles()+"");


        }


    }
    public void btn_min_click(){

        textFieldMain.appendText(1+"");
    }
    public void btn_x_click(){

        textFieldMain.appendText(1+"");
    }
    public void btn_equals_click(){

        textFieldMain.appendText(1+"");
    }
}
