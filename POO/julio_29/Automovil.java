package POO.julio_29;


public class Automovil implements Cinematica {

    private String marca;
    private String modelo;

    /* CONSTRUCTORES */
    public Automovil() {
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    /* GETTERS Y SETTERS */

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /* IMPLEMENTACIONES DE LA INTERFAZ */

    @Override
    public void acelerar(double aceleracion) {
        // TODA LA LOGICA DE ACELERAR	
        System.out.println("El automovil acelera a " + aceleracion + " m/s^2");
        System.out.println("Consumiendo gasolina...");
    }

    @Override
    public void frenar(double frenado) {
        // TODO Auto-generated method stub
        System.out.println("El automovil frena a " + frenado + " m/s^2");
        System.out.println("Desgastando llantas...");        
    }


}
