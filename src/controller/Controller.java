package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Controller {

    @FXML
    private Button four;

    @FXML
    private Button equals;

    @FXML
    private Button add;

    @FXML
    private Button openBracket;

    @FXML
    private Button closeBracket;

    @FXML
    private Button cofnij;

    @FXML
    private Button clearAll;

    @FXML
    private Button seven;

    @FXML
    private Button nine;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button five;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button eight;

    @FXML
    private Button six;

    @FXML
    private Button coma;

    @FXML
    private Button substract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private TextField textEquation;

    @FXML
    private TextField textResault;

    @FXML
    void buttonAction(ActionEvent event) throws ScriptException {
        if (event.getSource() == one) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "1");
        } else if (event.getSource() == two) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "2");
        } else if (event.getSource() == three) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "3");
        } else if (event.getSource() == four) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "4");
        } else if (event.getSource() == five) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "5");
        } else if (event.getSource() == six) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "6");
        } else if (event.getSource() == seven) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "7");
        } else if (event.getSource() == eight) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "8");
        } else if (event.getSource() == nine) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "9");
        } else if (event.getSource() == zero) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "0");
        }
        //coma
        else if (event.getSource() == coma) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + ".");
        }
        //usun calosc
        else if (event.getSource() == clearAll) {
            textEquation.clear();
            textResault.clear();
        }
        //usun ostatnie
        else if (event.getSource() == cofnij) {
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
            if (textEquation.getText().isEmpty()) {
                textResault.setText("0");
            } else {
                textResault.clear();
                String data = textEquation.getText();
                ScriptEngineManager mgr = new ScriptEngineManager();
                ScriptEngine engine = mgr.getEngineByName("js");
                textResault.setText(textResault.getText() + engine.eval(data));
                textEquation.clear();
            }
        }
        //brackets
        else if (event.getSource() == openBracket) {
            textEquation.setText(textEquation.getText() + "(");
        } else if (event.getSource() == closeBracket) {
            textEquation.setText(textEquation.getText() + ")");
        }
    }

    @FXML
    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getCode() == KeyCode.DIGIT1 || keyEvent.getCode() == KeyCode.NUMPAD1) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "1");
        } else if (keyEvent.getCode() == KeyCode.DIGIT2 || keyEvent.getCode() == KeyCode.NUMPAD2) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "2");
        } else if (keyEvent.getCode() == KeyCode.DIGIT3 || keyEvent.getCode() == KeyCode.NUMPAD3) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "3");
        } else if (keyEvent.getCode() == KeyCode.DIGIT4 || keyEvent.getCode() == KeyCode.NUMPAD4) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "4");
        } else if (keyEvent.getCode() == KeyCode.DIGIT5 || keyEvent.getCode() == KeyCode.NUMPAD5) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "5");
        } else if (keyEvent.getCode() == KeyCode.DIGIT6 || keyEvent.getCode() == KeyCode.NUMPAD6) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "6");
        } else if (keyEvent.getCode() == KeyCode.DIGIT7 || keyEvent.getCode() == KeyCode.NUMPAD7) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "7");
        } else if (keyEvent.getCode() == KeyCode.DIGIT8 || keyEvent.getCode() == KeyCode.NUMPAD8) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "8");
        } else if (keyEvent.getCode() == KeyCode.DIGIT9 || keyEvent.getCode() == KeyCode.NUMPAD9) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "9");
        } else if (keyEvent.getCode() == KeyCode.DIGIT0 || keyEvent.getCode() == KeyCode.NUMPAD0) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + "0");
        }
        //COMMA
        else if (keyEvent.getCode() == KeyCode.PERIOD) {
            textResault.clear();
            textEquation.setText(textEquation.getText() + ".");
        }
        //ADD
        else if (keyEvent.getCode() == KeyCode.ADD) {
            textEquation.setText(textEquation.getText() + "+");
        }
        //SUBTRACT
        else if (keyEvent.getCode() == KeyCode.SUBTRACT) {
            textEquation.setText(textEquation.getText() + "-");
        }
        //DIVIDE
        else if (keyEvent.getCode() == KeyCode.DIVIDE) {
            textEquation.setText(textEquation.getText() + "/");
        }
        //MULTIPLY
        else if (keyEvent.getCode() == KeyCode.MULTIPLY) {
            textEquation.setText(textEquation.getText() + "*");
        }
        //BRACKETS
        else if (keyEvent.getCode() == KeyCode.OPEN_BRACKET) {
            textEquation.setText(textEquation.getText() + "(");
        } else if (keyEvent.getCode() == KeyCode.CLOSE_BRACKET) {
            textEquation.setText(textEquation.getText() + ")");
        }
        //EQUALS
        else if (keyEvent.getCode() == KeyCode.ENTER) {
            if (textEquation.getText().isEmpty()) {
                System.out.println("YYY");
                textResault.setText("0");
            } else {
                System.out.println("XXX");
                textResault.clear();
                String data = textEquation.getText();
                ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
                ScriptEngine engine = scriptEngineManager.getEngineByName("js");
                try {
                    textResault.setText(textResault.getText() + engine.eval(data));
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
                textEquation.clear();
            }
        }
    }
}