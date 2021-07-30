public class Blux extends Telefono implements Camara, LectorBiometrico{

    public Blux() {
    }

    public Blux(String os, String model, String color, String ram) {
        super(os, model, color, ram);
    }

    @Override
    public String grabar() {
        // TODO Auto-generated method stub
        return "Estoy grabando desde mi Blux";
    }

    @Override
    public String zoom() {
        // TODO Auto-generated method stub
        return "Estoy haciendo zoom con la camara Blux HD";
    }

    @Override
    public String guardarHuella() {
        // TODO Auto-generated method stub
        return"La huella esta Guardada EN mI bLUX";
    }

    @Override
    public String lectorHuella() {
        // TODO Auto-generated method stub
        return "Tiene Lector de huella MI BLUX";
    }
    
}
