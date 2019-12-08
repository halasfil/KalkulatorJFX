package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.script.*;

public class Controller {

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button tree;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button coma;

    @FXML
    private Button clearAll;

    @FXML
    private Button add;

    @FXML
    private Button substract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button equals;

    @FXML
    private Button cofnij;

    @FXML
    private Button openBracket;

    @FXML
    private Button closeBracket;

    @FXML
    private TextField textResault;

    @FXML
    private TextField textEquation;

    @FXML
    void buttonAction(ActionEvent event) throws ScriptException {
        System.out.println("Wcisnieto przycisk");
        if (event.getSource() == one) {
            textEquation.setText(textEquation.getText() + "1");
        } else if (event.getSource() == two) {
            textEquation.setText(textEquation.getText() + "2");
        } else if (event.getSource() == tree) {
            textEquation.setText(textEquation.getText() + "3");
        } else if (event.getSource() == four) {
            textEquation.setText(textEquation.getText() + "4");
        } else if (event.getSource() == five) {
            textEquation.setText(textEquation.getText() + "5");
        } else if (event.getSource() == six) {
            textEquation.setText(textEquation.getText() + "6");
        } else if (event.getSource() == seven) {
            textEquation.setText(textEquation.getText() + "7");
        } else if (event.getSource() == eight) {
            textEquation.setText(textEquation.getText() + "8");
        } else if (event.getSource() == nine) {
            textEquation.setText(textEquation.getText() + "9");
        } else if (event.getSource() == zero) {
            textEquation.setText(textEquation.getText() + "0");
        }
        //coma
        else if (event.getSource() == coma) {
            textEquation.setText(textEquation.getText() + ".");
        } else if (event.getSource() == clearAll) {
            textEquation.clear();
            textResault.clear();
        } else if (event.getSource() == cofnij) {
            textEquation.setText(textEquation.getText().substring(0, textEquation.getText().length() - 1));
        }
        //dodawanie
        else if (event.getSource() == add) {
            textEquation.setText(textEquation.getText() + "+");
        }
        //odejmowanie
        else if (event.getSource() == substract) {
            textEquation.setText(textEquation.getText() + "-");
        }
        //mnozenie
        else if (event.getSource() == multiply) {
            textEquation.setText(textEquation.getText() + "*");
        }
        //dzielenie
        else if (event.getSource() == divide) {
            textEquation.setText(textEquation.getText() + "/");
        }
        //rowna sie
        else if (event.getSource() == equals) {
            textResault.clear();
            String data = textEquation.getText();
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("js");
            textResault.setText(textResault.getText() + engine.eval(data));
        }
        //brackets
        else if (event.getSource() == openBracket) {
            textEquation.setText(textEquation.getText() + "(");
        }
        else if (event.getSource() == closeBracket) {
            textEquation.setText(textEquation.getText() + ")");
        }
    }

}
