public class App {
    public static void main(String[] args) throws Exception {
        // en ambientes Estaticos no es necesario instanciar la clase
        Estaticos e1 = new Estaticos(); 
        Estaticos e2 = new Estaticos(); 
        Estaticos e3 = new Estaticos(); 
        NoEstatico e4 = new NoEstatico(); 
        NoEstatico e5 = new NoEstatico(); 
        NoEstatico e6 = new NoEstatico(); 

        Estaticos.setName ("Dilan S.");
        // NoEstatico.setName ("Dilan Solar");
        e4.setName ("David");
        e5.setName ("DiDa");
        //e6.apellido();
        System.out.println(e1.getName());
        System.out.println(e2.getName());
        System.out.println(e3.getName());
        System.out.println(e4.getName());
        System.out.println(e5.getName());
        System.out.println(e6.getApellido());


    }
}
