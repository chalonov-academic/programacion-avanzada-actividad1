public abstract class DispositivoElectronico{
    protected String dispositivo;
    protected int pantalla;

    public DispositivoElectronico(String dispositivo, int pantalla){
        this.dispositivo = dispositivo;
        this.pantalla = pantalla;
    };

    public String getDispositivo() {
        return dispositivo;
    }
    public int getPantalla() {
        return pantalla;
    }

    public abstract void encenderDispositivo();
    public abstract void apagarDispositivo();
}
