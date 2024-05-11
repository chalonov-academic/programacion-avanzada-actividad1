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
        System.out.println("Acelerar como " + getTipo() +"... Wroom! Wroom!");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar como carro");
    }

    @Override
    public void cargarCombustible() {
        System.out.println("Gasolina Premium");
    }

}
