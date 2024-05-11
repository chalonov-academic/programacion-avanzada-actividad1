public class Bicicleta extends DosRuedas implements Funcionamiento{
    private String modalidad;

    public Bicicleta(String modelo, String marca, String modalidad, String color) {
        super("Bicicleta", marca, modelo, color);
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar como bicicleta de " + getModalidad() + "!");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar como bicicleta");
    }

    @Override
    public void proteccion() {
        System.out.println("Protección: Casco y guantes");
    }
}
