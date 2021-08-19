import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SchoolGradingSystem extends GradingSystem {

    @FXML
    private TextField n;

    @FXML
    private TextArea datos;

    @FXML
    private TextArea salida;

    @FXML
    private Button calcular;

    @FXML
    void start(MouseEvent event) {
        try {
            super.n = Integer.parseInt(n.getText());
            super.datos = new Float[super.n][4];
            // Creamos una mariz con los datos de los estudiantes:
            for (int i = 0; i < super.n; i++) {
                for (int j = 0; j < 4; j++) {
                    super.datos[i][j] = Float.parseFloat(datos.getText().split("\n")[i].split(" ")[j]); // cadena entrada de datos
                }
            }
            salida.setText(String.format("%.2f%n %d%n %s%n %s", super.stat1(), super.stat2(), super.stat3(), super.stat4()));
            //salida.setText(String.format("%d Hola", super.n));
                        
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
