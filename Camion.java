public class Camion extends Vehiculo implements Funcionamiento, Combustible{
    private int volume;

    public Camion(String modelo, String marca, int volume, String color) {
        super("Camión",marca , modelo, color, 10);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar como " + getTipo());
    }

    @Override
    public void frenar() {
        System.out.println("Frenar como " + getTipo());
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Diesel");
    }
}
