public class Carro extends Vehiculo implements Funcionamiento, Combustible{
    private int volume;

    public Carro(String modelo, String marca, int volume, String color) {
        super(new Televisor(), new Computador(), "Automovil", marca, modelo, color,4);
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
        System.out.println("Cargar combustible: Gasolina Premium");
    }

    @Override
    public void descargarCombustible() {
        System.out.println("Se está acabando el combustible al " + getTipo().toLowerCase());
    }
}
