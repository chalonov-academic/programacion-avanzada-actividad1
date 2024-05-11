public class Scooter extends DosRuedas implements Funcionamiento{
    private String modalidad;

    public Scooter(String modelo, String marca, String modalidad, String color) {
        super("Scooter", marca, modelo, color);
        this.modalidad = modalidad;
    }

    public Scooter(String modalidad) {
        super("Scooter");
        this.modalidad = modalidad;
    }

    public String getModalidad() {
        return modalidad;
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerar como scooter" + getModalidad() + "!");
    }

    @Override
    public void frenar() {
        System.out.println("Frenar como scooter");
    }

    @Override
    public void proteccion() {
        System.out.println("Protección: Casco, rodilleras y guantes");
    }
}
