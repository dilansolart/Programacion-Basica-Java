public class Student{
    private String Nombre;
    private String Genero;
    private String Materia;
    private String Nota;
 
 public Student(String nombre, String genero, String materia, String nota) {
     Nombre = nombre;
     Genero = genero;
     Materia = materia;
     Nota = nota;
 }
 
 public String getNombre() {
     return Nombre;
 }
 
 public void setNombre(String nombre) {
     Nombre = nombre;
 }
 
 public String getGenero() {
     return Genero;
 }
 
 public void setGenero(String genero) {
     Genero = genero;
 }
 
 public String getMateria() {
     return Materia;
 }
 
 public void setMateria(String materia) {
     Materia = materia;
 }
 
 public String getNota() {
     return Nota;
 }
 
 public void setNota(String nota) {
     Nota = nota;
 }
}