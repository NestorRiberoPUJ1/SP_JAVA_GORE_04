package POO.julio_25;

public class MedioTransporte {

    /* ATRIBUTOS (VARIABLES) */
    /* SON TODAS LA VARIABLES QUE DESCRIBEN MI CLASE */
    private boolean transporteMasivo;
    private String medio;
    private boolean asientos;
    private int cantidadAsientos;
    private int pasajeros;
    private String combustible;
    private String tipo;

    /* CONSTRUCTORES */

 

    public MedioTransporte() {
    }

    public MedioTransporte(boolean transporteMasivo, String medio, boolean asientos, int cantidadAsientos,
            int pasajeros, String combustible, String tipo) {
        this.transporteMasivo = transporteMasivo;
        this.medio = medio;
        this.asientos = asientos;
        this.cantidadAsientos = cantidadAsientos;
        this.pasajeros = pasajeros;
        this.combustible = combustible;
        this.tipo = tipo;
    }

    public MedioTransporte(MedioTransporte medioTransporte){
        this(medioTransporte.transporteMasivo, medioTransporte.medio, medioTransporte.asientos, medioTransporte.cantidadAsientos, medioTransporte.pasajeros, medioTransporte.combustible, medioTransporte.tipo);
    }

    /* MÉTODOS */
    /* SON TODOS LOS COMPORTAMIENTOS QUE PUEDE REALIZAR MI CLASE */

    public void encender() {
        System.out.println("Encendiendo el " + tipo);
    }

    public void apagar() {
        System.out.println("Apagando el " + tipo);
    }

    public void acelerar() {
        System.out.println("Acelerando el " + tipo);
    }

    public void frenar() {
        System.out.println("Frenando el " + tipo);
    }

    public void recogerPasajeros() {
        System.out.println("Recogiendo pasajeros en el " + tipo);
        System.out.println("Pasajeros a bordo: " + pasajeros);
    }

    public void recogerPasajeros(int nuevosPasajeros) {
        this.pasajeros += nuevosPasajeros;
        System.out.println("Recogiendo pasajeros en el " + tipo);
        System.out.println("Pasajeros a bordo: " + pasajeros);
    }

    public int pasajerosSinAsiento() {
        return pasajeros - cantidadAsientos;
    }

    /* GETTERS Y SETTERS */

    public boolean isTransporteMasivo() {
        return transporteMasivo;
    }

    public void setTransporteMasivo(boolean esMasivo) {
        this.transporteMasivo = esMasivo;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public boolean isAsientos() {
        return asientos;
    }

    public void setAsientos(boolean tieneAsientos) {
        this.asientos = tieneAsientos;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int asientos) {
        this.cantidadAsientos = asientos;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


}
