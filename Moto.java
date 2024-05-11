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
        System.out.println("Acelerar como moto!");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar como moto");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Gasolina 98 octanos");
    }

    @Override
    public void proteccion() {
        System.out.println("Protección: Casco, botas y guantes");
    }
}
