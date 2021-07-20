public class Student {
    private int codigo;
    private final String nombre;
    private double nota1;
    private double nota2;
    private double nota3;
    private static int consecutivo = 0;
    
    
    public Student(String nombre, double nota1, double nota2, double nota3) {
        this.codigo = consecutivo;
        consecutivo++;
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double promedio() {
        return (this.nota1 + this.nota2 + this.nota3) / 3;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public static int getConsecutivo() {
        return consecutivo;
    }

    public static void setConsecutivo(int consecutivo) {
        Student.consecutivo = consecutivo;
    }

 
    
}
