package Familia;

public class Clase1 {
    private String atributo1="Privado";
    public String atributo2="Público";
    protected String atributo3="Protegido";
    String atributo4="Por defecto";

    public void imprimir()
    {
        System.out.printf("Este es el contenido de la clase 1: %s, %s, %s, %s", atributo1, atributo2, atributo3, atributo4);
    }

}
