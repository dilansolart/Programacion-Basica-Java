import java.util.*;

public class SchoolGradingSystem extends GradingSystem {
    public void loadData() {
        Scanner input = new Scanner (System.in);
        this.n = input.nextInt(); // n Numero de estudiantes
        this.datos = new Float[this.n][4];
        // Creamos una mariz con los datos de los estudiantes:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                this.datos[i][j] = Float.parseFloat(input.next()); // cadena entrada de datos
            }
        }
        input.close();
    }
}
