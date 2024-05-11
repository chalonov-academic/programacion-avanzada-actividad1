public class Vehiculo {
    private String tipo;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;
    private Televisor televisor;
    private Computador computador;

    Vehiculo(String tipo, int ruedas){
        this.tipo = tipo;
        this.ruedas = ruedas;
    }

    Vehiculo(String tipo, String marca, String modelo, String color, int ruedas){
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
    }

    Vehiculo(Televisor televisor, Computador computador, String tipo, String marca, String modelo, String color, int ruedas){
        this.televisor = new Televisor();
        this.computador = new Computador();
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.ruedas = ruedas;
    }

    public String getTipo(){
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getColor() {
        return color;
    }
    public int getRuedas() {
        return ruedas;
    }

    public Televisor getTelevisor() {
        return televisor;
    }

    public Computador getComputador() {
        return computador;
    }

    public void fromTelevisorOn(){
        getTelevisor().encenderDispositivo();
    }

    public void fromComputadorOn(){
        getComputador().encenderDispositivo();
    }

    public void fromTelevisorOff(){
        getTelevisor().apagarDispositivo();
    }

    public void fromComputadorOff(){
        getComputador().apagarDispositivo();
    }
}
