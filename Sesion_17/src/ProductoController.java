import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javaConnect.Connect;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class ProductoController {

    @FXML
    private TextField codigotxt;

    @FXML
    private TextField nombretxt;

    @FXML
    private TextField precioCompratxt;

    @FXML
    private TextField precioVentatxt;

    @FXML
    private TextField cantBodegatxt;

    @FXML
    private TextField cantMinBodegatxt;

    @FXML
    private TextField cantMaxStocktxt;

    @FXML
    private Button createButton;
    
    @FXML
    private TextArea verText;

    @FXML
    void createProduct(ActionEvent event) {
        Connect conexion = new Connect();
        int codigo = Integer.parseInt(codigotxt.getText());
        String nombre = nombretxt.getText();
        int precioCompra = Integer.parseInt(precioCompratxt.getText());
        int precioVenta = Integer.parseInt(precioVentatxt.getText());
        int cantBodega = Integer.parseInt(cantBodegatxt.getText());
        int cantMinBodega = Integer.parseInt(cantMinBodegatxt.getText());
        int cantMaxStock = Integer.parseInt(cantMaxStocktxt.getText());
        try {
            Connection con1 = conexion.connect();
            Statement stament1 = con1.createStatement();
            stament1.executeUpdate("insert into Producto(Codigo, Nombre, PrecioCompra, PrecioVenta, CantBodega, CantMinBodega, CantMaxStock) VALUES ("+codigo+", "+"'"+nombre+"'"+", "+precioCompra+", "+precioVenta+", "+cantBodega+", "+cantMinBodega+", "+cantMaxStock+");");
            System.out.println("Producto creado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void verProductos(MouseEvent event) {
        Connect conexion = new Connect();
        String verBD = "Select * from Producto";
        try {
            Connection con2 = conexion.connect();
            Statement stament2 = con2.createStatement();
            ResultSet rs = stament2.executeQuery(verBD);
            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();
            String productos = "";
            while(rs.next()) {
                for(int i = 1; i < columnas; i++) {
                    String valorColumna = rs.getString(i);
                    productos = productos + rmd.getColumnName(i) + ": " + valorColumna + "   |   " ;
                }
                productos += "\n";
            }
            verText.setText(productos);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }   

}
