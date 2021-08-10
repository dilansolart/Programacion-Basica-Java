import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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
                mensaje.setText("Usuario no Valido");
            } else if (contraseña.length() < 6) {
                mensaje.setText("Contraseña debe contar con más de 6 caracteres. Intente nuevamente");
            } else if (usuario.toLowerCase() == contraseña.toLowerCase()) {
                mensaje.setText("Contraseña no puede ser igual a usuario. Intente nuevamente.");
            } else {
                try {
                    mensaje.setText("");
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Vistas/inicio.fxml"));
                    Parent root = fxmlLoader.load();
                    InicioController controlador = fxmlLoader.getController();
                    
                    Scene scene = new Scene(root);
                    Stage stage = new Stage();
                    // stage.initModality(Modality.APPLICATION_MODAL);
                    stage.setTitle("Add Products");
                    stage.getIcons().add(new Image("/img/favicon.png"));
                    stage.setScene(scene);
                    stage.showAndWait();
                } catch (Exception ex) {
                    System.out.println("Error");
                }
            }
        } catch (Exception e) {
            System.out.println("Error");
        } 

    }
}
