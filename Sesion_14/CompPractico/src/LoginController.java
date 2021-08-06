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
            if(usuario.equalsIgnoreCase("dida")){
                if (contraseña == null) {
                    mensaje.setText("Ingrese Contraseña");
                } else if (contraseña.equals("Dilanbass")) {
                    mensaje.setText("Bienvenido señor");
                } else mensaje.setText("Usuario no Valido");
            } else mensaje.setText("Usuario no Valido");
        } catch (Exception e) {
            System.out.println("Error");
        } 

    }
}
