public abstract class DosRuedas extends Vehiculo{

    public DosRuedas(String tipo, String marca, String modelo, String color) {
        super(tipo, marca, modelo, color, 2);
    }

    public DosRuedas(String tipo) {
        super(tipo, 2);
    }

    public abstract void proteccion();

}
