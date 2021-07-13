public class Computer {
    private String Model;
    public String OS;
    public String Processor;
    public String MemoryRam;
    public String Color;
    public String Trademark;
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public String marcaModel() {
        return ("Marca: "+ this.Trademark + " y modelo: " + this.Model);
    }
}
