public class Computador extends DispositivoElectronico{

    public Computador(){
        super("Computador", 15);
    }

    @Override
    public void encenderDispositivo() {
        System.out.println(getDispositivo() + " de " + getPantalla() + "\" encendido");
    }

    @Override
    public void apagarDispositivo() {
        System.out.println(getDispositivo() + " de " + getPantalla() + "\" apagado");
    }
}
