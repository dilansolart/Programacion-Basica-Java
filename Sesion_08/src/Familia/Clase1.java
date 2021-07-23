package Familia;

public class Clase1 {
    private String atributo1 = "Hola, soy privado";
    public String atributo2 = "Hola, soy publico";
    protected String atributo3 = "Hola, soy protegido";
    String atributo4 = "Hola, soy por defecto";

    public void imprimir() {
        System.out.printf("Estos son los atributos de la clase:%n %s%n %s%n %s%n %s", this.atributo1, this.atributo2, this.atributo3, this.atributo4);
    }
}