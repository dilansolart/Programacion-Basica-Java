import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class WinController extends GradingSystem {

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
            SchoolGradingSystem student1 = new SchoolGradingSystem();
            Integer est = Integer.parseInt(n.getText());
            String nDatos = datos.getText();
            String[] arrData = nDatos.split("\n");
            student1.loadData(est,arrData);
            
            Resultados.setText(String.format("%.2f%n %d%n %s%n %s",student1.stat1(),student1.stat2(),student1.stat3(),student1.stat4()));
                        
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
