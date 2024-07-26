package POO.julio_25;

public class MedioTransporteTest {
    public static void main(String[] args) {

        /* CREAR UNA INSTANCIA */
        // nombre de la clase + nombre del objeto = new + constructor
        MedioTransporte avion = new MedioTransporte();
        avion.setTransporteMasivo(true);
        avion.setMedio("Aereo");
        avion.setAsientos(true);
        avion.setCantidadAsientos(180);
        avion.setPasajeros(200);
        avion.setCombustible("JET FUEL");
        avion.setTipo("Avion");

        System.out.println("El medio de transporte es: " + avion.getMedio());

        MedioTransporte carro = new MedioTransporte(false, "Terrestre", true, 5, 5, "Gasolina", "Carro");
        System.out.println("El medio de transporte es: " + carro.getMedio());

        avion.encender();
        System.out.println("Pasajeros sin asiento: " + avion.pasajerosSinAsiento());

        carro.acelerar();


        avion.recogerPasajeros();
        avion.recogerPasajeros(10);
        System.out.println("Pasajeros sin asiento: " + avion.pasajerosSinAsiento());

    }
}
