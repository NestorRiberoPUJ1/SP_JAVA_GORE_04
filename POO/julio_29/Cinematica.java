package POO.julio_29;

public interface Cinematica {

    public static final double GRAVEDAD = 9.81;
    public static final double VELOCIDAD_LUZ = 299792458;
    public static final double VELOCIDAD_SONIDO = 343;


    void acelerar(double aceleracion);
    void frenar(double frenado);
   
}
