import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class InicioController {

    @FXML
    private TextField codigo;

    @FXML
    private TextField nombre;

    @FXML
    private TextField precioCompra;

    @FXML
    private TextField precioVenta;

    @FXML
    private TextField cantBodega;

    @FXML
    private TextField cantMinBodega;

    @FXML
    private TextField cantMaxStock;

    @FXML
    private Button createButton;

    @FXML
    void createProduct(ActionEvent event) {
        
    }

}
