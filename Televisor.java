public class Televisor extends DispositivoElectronico{

    public Televisor(){
        super("Televisor", 32);
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
