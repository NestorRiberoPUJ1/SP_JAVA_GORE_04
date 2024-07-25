package POO.julio_25;

public class MedioTransporteTest {
    public static void main(String[] args) {

        /* CREAR UNA INSTANCIA */
        // nombre de la clase + nombre del objeto = new + constructor
        MedioTransporte avion = new MedioTransporte();
        avion.esMasivo = true;
        avion.medio = "Aéreo";
        avion.tieneAsientos = true;
        avion.pasajeros = 200;
        avion.combustible = "JET FUEL";
        avion.tipo = "Avión";

        System.out.println("El medio de transporte es: " + avion.medio);

        MedioTransporte carro = new MedioTransporte(false, "Terrestre", true, 5, "Gasolina", "Carro");
        System.out.println("El medio de transporte es: " + carro.medio);

        
    }
}
