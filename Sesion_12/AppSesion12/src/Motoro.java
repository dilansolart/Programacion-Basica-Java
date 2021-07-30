public class Motoro extends Telefono implements Camara, LectorBiometrico {

    public Motoro() {
    }

    public Motoro(String os, String model, String color, String ram) {
        super(os, model, color, ram);
    }

    @Override
    public String grabar() {
        // TODO Auto-generated method stub
        return "Estoy grabando desde mi Motoro";
    }

    @Override
    public String zoom() {
        // TODO Auto-generated method stub
        return "Estoy haciendo zoom con la camara";
    }

    @Override
    public String guardarHuella() {
        // TODO Auto-generated method stub
        return "La huella esta Guardada";
    }

    @Override
    public String lectorHuella() {
        // TODO Auto-generated method stub
        return "Tiene Lector de huella";
    }
    
    
}
