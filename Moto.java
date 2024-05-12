public class Moto extends DosRuedas implements Funcionamiento, Combustible{
    private int volume;

    public Moto(String modelo, String marca, int volume, String color) {
        super("Motocicleta", marca, modelo, color);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void acelerar() {
        System.out.println(getTipo() + " está acelerando... Wroom! Wroom!");
    }

    @Override
    public void frenar() {
        System.out.println(getTipo() + " está frenando... Screech! Screech!");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Cargar combustible: Gasolina 98 octanos");
    }

    @Override
    public void descargarCombustible() {
        System.out.println("Se está acabando el combustible a la " + getTipo().toLowerCase());
    }

    @Override
    public void proteccion() {
        System.out.println("Usar protección: Casco, botas y guantes");
    }
}
