
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Sandero","Renault", 1600, "Azul");
        Moto moto1 = new Moto("Ninja 400 KRT", "Kawasaki", 400, "Verde");
        Bicicleta bici1 = new Bicicleta("Madone", "Trek", "ruta", "Blanca");
        Camion camion1 = new Camion("S-Way", "Iveco", 12800, "Naranja");
        Scooter scooter1 = new Scooter("Eléctrica");

        System.out.println("Vehiculo de " + carro1.getRuedas() + " ruedas: " + carro1.getMarca() + "-" + carro1.getModelo() + " (" + carro1.getColor() + ")");
        System.out.println("Tipo: " + carro1.getTipo() + " (" + carro1.getVolume() + "cc)");
        carro1.acelerar();
        carro1.descargarCombustible();
        carro1.frenar();
        carro1.cargarCombustible();
        System.out.println();

        System.out.println("Vehiculo de " + moto1.getRuedas() + " ruedas: " + moto1.getMarca() + "-" + moto1.getModelo() + " (" + moto1.getColor() + ")");
        System.out.println("Tipo: " + moto1.getTipo() + " (" + moto1.getVolume() + "cc)");
        moto1.proteccion();
        moto1.acelerar();
        moto1.descargarCombustible();
        moto1.frenar();
        moto1.cargarCombustible();
        System.out.println();

        System.out.println("Vehiculo de " + bici1.getRuedas() + " ruedas: " + bici1.getMarca() + "-" + bici1.getModelo()+ " (" + bici1.getColor() + ")");
        System.out.println("Tipo: " + bici1.getTipo() + " (" + bici1.getModalidad() + ")");
        bici1.proteccion();
        bici1.acelerar();
        bici1.frenar();
        System.out.println();

        System.out.println("Vehiculo de " + camion1.getRuedas() + " ruedas: " + camion1.getMarca() + "-" + camion1.getModelo() + " (" + camion1.getColor() + ")");
        System.out.println("Tipo: " + camion1.getTipo() + " (" + camion1.getVolume() + "cc)");
        camion1.cargarCombustible();
        camion1.acelerar();
        camion1.frenar();
        System.out.println();

        System.out.println("Vehiculo de " + scooter1.getRuedas() + " ruedas");
        System.out.println("Tipo: " + scooter1.getTipo() + " (" + scooter1.getModalidad() + ")");
        scooter1.proteccion();
        scooter1.acelerar();
        scooter1.frenar();
        System.out.println();

        System.out.println("Vehiculo de " + carro1.getRuedas() + " ruedas: " + carro1.getMarca() + "-" + carro1.getModelo() + " (" + carro1.getColor() + ")");
        carro1.fromTelevisorOn();
        carro1.fromTelevisorOff();

        System.out.println();

        System.out.println("Vehiculo de " + camion1.getRuedas() + " ruedas: " + camion1.getMarca() + "-" + camion1.getModelo() + " (" + camion1.getColor() + ")");
        camion1.fromComputadorOn();
        camion1.fromComputadorOff();
    }
}