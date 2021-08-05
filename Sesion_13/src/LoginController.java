import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class LoginController {

    @FXML
    private TextField usertxt;

    @FXML
    private Button idInitBtn;

    @FXML
    private PasswordField passtxt;

    @FXML
    private Label mensaje;

    @FXML
    void start(MouseEvent event) {
        try {
            String usuario = usertxt.getText();
            String contraseña = passtxt.getText();
            if(usuario.equalsIgnoreCase("prueba")){
                mensaje.setText("Usuario no válido");
            }
        } catch (Exception e) {
            System.out.println("Error");
        } 

    }
}
