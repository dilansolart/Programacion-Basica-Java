import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import JavaConnect.Connect;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SchoolSystemController extends GradingSystem {

    @FXML
    private TextField iNombre, iMateria, iNota, iGenero, cNombre, cMateria;
    @FXML
    private Button iGuardarBtn, cargarBtn, procesarBtn, consultarBtn, eliminarBtn;
    @FXML
    private TextArea textDatosCargados, outData, outAccion;
    
    @FXML
    void guardarReg(MouseEvent event) {
        Connect conexion = new Connect();
        String nombre = iNombre.getText();
        String genero = iGenero.getText();
        String materia = iMateria.getText();
        float nota = Float.parseFloat(iNota.getText());
        try {
            Connection conex = conexion.connect();
            Statement stament1 = conex.createStatement();
            stament1.executeUpdate("insert into Students(Nombre, Nota, Genero, Materia) VALUES ("+"'"+nombre+"'"+", "+"'"+nota+"'"+", "+"'"+genero+"'"+", "+"'"+materia+"'"+");");
            System.out.println("Estudiante Creado!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @FXML
    void loadData(MouseEvent event) {
        Connect conexion = new Connect();
        String verBD = "Select * from Students";
        String nameStudent [] = {"armando", "nicolas", "daniel", "maria", "marcela", "alexandra"};
        String idStudent [] = {"1", "2", "3", "4", "5", "6"};
        String matter [] = {"historia", "literatura", "biologia"};
        String idMatter [] = {"1", "2", "3"};
        try {
            Connection con2 = conexion.connect();
            Statement stament2 = con2.createStatement();
            ResultSet rs = stament2.executeQuery(verBD);
            ResultSetMetaData rmd = rs.getMetaData();
            int columnas = rmd.getColumnCount();
            int fila = 0;
            String estudiantes = "";
            while(rs.next()) {
                String nombreE = rs.getString(1).toLowerCase();
                String generoE = rs.getString(2).toLowerCase();
                String materiaE = rs.getString(3).toLowerCase();
                String notaE = rs.getString(4).toLowerCase();
                fila++;
                for(int i = 1; i <= columnas; i++) {
                    if (i == 1) {
                        for (int j = 0; j < nameStudent.length; j++) {
                            boolean flag = false;
                            if (nombreE.equals(nameStudent[j]) || nombreE.equals(idStudent[j])) {
                                estudiantes += String.valueOf(((float) (j + 1))) + " ";
                                flag = true;
                                break;
                            } else if (j == nameStudent.length - 1 && flag == false) {
                                estudiantes += "0.0 ";
                            }
                        }
                    } else if (i == 2) {
                        if (generoE.equals("m") || generoE == "0") {
                            estudiantes += "0.0 ";
                        } else if (generoE.equals("f") || generoE == "1") {
                            estudiantes += "1.0 ";
                        }
                    } else if (i == 3) {
                        for (int j = 0; j < matter.length; j++) {
                            boolean flag = false;
                            if (materiaE.equals(matter[j]) || materiaE.equals(idMatter[j])) {
                                estudiantes += String.valueOf(((float) (j + 1))) + " ";
                                flag = true;
                                break;
                            } else if (j == matter.length - 1 && flag == false) {
                                estudiantes += "0.0 ";
                            }
                        }
                    } else if (i == 4) {
                        estudiantes += notaE;
                    }
                    // estudiantes = estudiantes + rmd.getColumnName(i) + ": " + valorColumna + "   |   " ;
                }
                estudiantes += "\n";
            }
            super.n = fila;
            textDatosCargados.setText(estudiantes);
            super.datos = new Float[super.n][4];
            // Creamos una mariz con los datos de los estudiantes:
            for (int i = 0; i < super.n; i++) {
                for (int j = 0; j < 4; j++) {
                    super.datos[i][j] = Float.parseFloat(estudiantes.split("\n")[i].split(" ")[j]); // cadena entrada de datos
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void calcularDatos(MouseEvent event) {
        String salidaTxt = "";
        salidaTxt += String.format("%.2f %n%d %n", super.stat1(), super.stat2());
        // (String.format("%.2f%n %d%n %s%n %s", super.stat1(), super.stat2(), super.stat3(), super.stat4()));
        if (super.stat3() == "-1") {
            salidaTxt += "<Materia>\n";
        } else {
            salidaTxt += String.format("%s%n", super.stat3());
        }
        if (super.stat4() == "-1") {
            salidaTxt += "<Estudiante>\n";
        } else {
            salidaTxt += String.format("%s%n", super.stat4());
        }
        outData.setText(salidaTxt);
    }

    @FXML
    void consultarData(MouseEvent event) {
        Connect conexion = new Connect();
        Connection con2 = conexion.connect();
        String conNombre = cNombre.getText();
        String conMateria = cMateria.getText();
        String consulta = "";
        try {
            if(!conNombre.equals("") && conMateria.equals("")) {
                String sql = "SELECT * FROM Student WHERE Nombre=?";
                PreparedStatement ps = con2.prepareStatement(sql);
                ps.setString(1, conNombre);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    consulta += rs.getString("Nombre") + ' ' + rs.getString("Genero") + ' ' + rs.getString("Materia") + ' ' + rs.getString("Nota") + "\n";
                    outAccion.setText(consulta);
                }
            } else if(conNombre.equals("") && !conMateria.equals("")) {
                String sql = "SELECT * FROM Student WHERE Materia=?";
                PreparedStatement ps = con2.prepareStatement(sql);
                ps.setString(1, conMateria);
                ResultSet rs = ps.executeQuery();
                while(rs.next()) {
                    consulta += rs.getString("Nombre") + ' ' + rs.getString("Genero") + ' ' + rs.getString("Materia") + ' ' + rs.getString("Nota") + "\n";
                    outAccion.setText(consulta);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void eliminarData(MouseEvent event) {

    }



}
