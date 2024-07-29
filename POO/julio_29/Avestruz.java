package POO.julio_29;

public class Avestruz extends Oviparos implements Cinematica {

    private String nombre;
    private int edad;

    /* CONSTRUCTORES */

    public Avestruz() {

        Avestruz.contadorOviparos++;
    }

    public Avestruz(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;

        Avestruz.contadorOviparos++;
    }

    /* GETTERS Y SETTERS */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /* IMPLEMENTACION METODOS INTERFAZ */

    @Override
    public void acelerar(double aceleracion) {
        // TODO Auto-generated method stub
        System.out.println("El avestruz acelera a " + aceleracion + " m/s^2");
        System.out.println("Corriendo...");
    }

    @Override
    public void frenar(double frenado) {
        // TODO Auto-generated method stub
        System.out.println("El avestruz frena a " + frenado + " m/s^2");
        System.out.println("Cansado...");
    }


    /* METODOS DE CLASE ABSTRACTA */

    @Override
    void alimentarse() {
        // TODO Auto-generated method stub
        System.out.println("El avestruz se alimenta de plantas...");
    }

    @Override
    void moverse() {
        // TODO Auto-generated method stub
        System.out.println("El avestruz corre a 70 km/h...");
    }


    @Override
    void hacerNido() {
        // TODO Auto-generated method stub
        super.hacerNido();
        System.out.println("A la manera del avestruz...");
    }
}
