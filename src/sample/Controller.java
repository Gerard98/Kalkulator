package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField textField;
    @FXML
    Label label;

    private double x;
    private double y;
    private String dzialanie;
    private boolean byloDzialanie;

    @FXML
    public void initialize(){
        dzialanie = "brak";
    }


    @FXML
    public void koniec(){
        if(y!=0) {
            if (dzialanie == "dodawanie") textField.setText(Double.toString(kalkulator.DODAWANIE.dzialanie(y, x)));
            if (dzialanie == "odejmowanie") textField.setText(Double.toString(kalkulator.ODEJMOWANIE.dzialanie(y, x)));
            if (dzialanie == "dzielenie") textField.setText(Double.toString(kalkulator.DZIELENIE.dzialanie(y, x)));
            if (dzialanie == "mnozenie") textField.setText(Double.toString(kalkulator.MNOZENIE.dzialanie(y, x)));
            x = 0;
            y = 0;
            byloDzialanie = true;
            dzialanie = "brak";
            label.setText("");
        }
    }

    @FXML
    public void C(){
        x=0;
        y=0;
        byloDzialanie = false;
        dzialanie = "brak";
        textField.setText("");
    }

    @FXML
    public void dodawanie(){
        if(dzialanie == "brak" && textField.getText() != "") {
            label.setText(x + " +");
            y = x;
            x = 0;
            dzialanie = "dodawanie";
            textField.setText("");
        }
    }

    @FXML
    public void odejmowanie(){
        if(dzialanie == "brak" && textField.getText() != "") {
            label.setText(x + " -");
            y = x;
            x = 0;
            dzialanie = "odejmowanie";
            textField.setText("");
        }
    }

    @FXML
    public void dzielenie(){
        if(dzialanie == "brak" && textField.getText() != "") {
            label.setText(x + " /");
            y = x;
            x = 0;
            dzialanie = "dzielenie";
            textField.setText("");
        }
    }


    @FXML
    public void mnozenie(){
        if(dzialanie == "brak" && textField.getText() != "") {
            label.setText(x + " *");
            y = x;
            x = 0;
            dzialanie = "mnozenie";
            textField.setText("");
        }
    }

    @FXML
    public void zero(){
        if(!byloDzialanie) {
            if (textField.getText() != "") {
                x = x * 10;
                textField.setText(textField.getText() + "0");
            }
        }
    }

    @FXML
    public void jeden(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 1;
            else x = 1;
            textField.setText(textField.getText() + "1");
        }
        else{
            byloDzialanie = false;
            textField.setText("1");
            x = 1;
        }

    }

    @FXML
    public void dwa(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 2;
            else x = 2;
            textField.setText(textField.getText() + "2");
        }
        else{
            byloDzialanie = false;
            textField.setText("2");
            x = 2;
        }
    }

    @FXML
    public void trzy(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 3;
            else x = 3;
            textField.setText(textField.getText() + "3");
        }
        else{
            byloDzialanie = false;
            textField.setText("3");
            x = 3;
        }
    }

    @FXML
    public void cztery(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 4;
            else x = 4;
            textField.setText(textField.getText() + "4");
        }
        else{
            byloDzialanie = false;
            textField.setText("4");
            x = 4;
        }
    }

    @FXML
    public void piec(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 5;
            else x = 5;
            textField.setText(textField.getText() + "5");
        }
        else{
            byloDzialanie = false;
            textField.setText("5");
            x = 5;
        }
    }

    @FXML
    public void szesc(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 6;
            else x = 6;
            textField.setText(textField.getText() + "6");
        }
        else{
            byloDzialanie = false;
            textField.setText("6");
            x = 6;
        }
    }

    @FXML
    public void siedem(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 7;
            else x = 7;
            textField.setText(textField.getText() + "7");
        }
        else{
            byloDzialanie = false;
            textField.setText("7");
            x = 7;
        }
    }

    @FXML
    public void osiem(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 8;
            else x = 8;
            textField.setText(textField.getText() + "8");
        }
        else{
            byloDzialanie = false;
            textField.setText("8");
            x = 8;
        }
    }

    @FXML
    public void dziewiec(){
        if(!byloDzialanie) {
            if (textField.getText() != "") x = x * 10 + 9;
            else x = 9;
            textField.setText(textField.getText() + "9");
        }
        else{
            byloDzialanie = false;
            textField.setText("9");
            x = 9;
        }
    }


}
