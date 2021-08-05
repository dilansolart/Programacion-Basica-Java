import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField resultText;

    @FXML
    private Button boton7;

    @FXML
    private Button boton8;

    @FXML
    private Button boton9;

    @FXML
    private Button botondiv;

    @FXML
    private Button boton4;

    @FXML
    private Button boton5;

    @FXML
    private Button boton6;

    @FXML
    private Button botonmult;

    @FXML
    private Button boton1;

    @FXML
    private Button boton2;

    @FXML
    private Button boton3;

    @FXML
    private Button botonresta;

    @FXML
    private Button botonreset;

    @FXML
    private Button boton0;

    @FXML
    private Button botonigual;

    @FXML
    private Button botonsuma;

    @FXML
    void addNumber(ActionEvent event) {
        Node node = (Node) event.getSource();
        String data = (String) node.getUserData(); 
        if (resultText.getText().equals("0")) {
            resultText.setText(data);
        } else {
            resultText.setText(resultText.getText() + data);
        }
    }

    @FXML
    void addOperator(ActionEvent event) {

    }

}
