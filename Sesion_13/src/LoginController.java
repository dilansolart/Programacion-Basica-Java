import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    void start(MouseEvent event) {
        System.out.println("Ha iniciado Sesion"); 
    }

}
