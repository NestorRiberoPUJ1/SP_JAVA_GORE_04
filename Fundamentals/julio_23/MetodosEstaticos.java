package Fundamentals.julio_23;

public class MetodosEstaticos {

    public static void main(String[] args) {

        saludar();
        saludarPersona("Nestor");
        felicitarCumple("Nestor", 27);
        int resultado = sumar(1, 4);
        sumar(1,2,3);
        sumar(3.14, 2.71);
        System.out.println("El resultado de la suma es: " + resultado);
    }

    /* METODOS ESTÁTICOS */
    // public static tipo nombreMetodo(parametros) { ... }

    // SIN ARGUMENTOS
    public static void saludar() {
        System.out.println("Hola Mundo");
    }

    // CON ARGUMENTOS
    public static void saludarPersona(String nombre) {
        System.out.println("Hola " + nombre);
    }

    // ARGUMENTOS MULTIPLES
    public static void felicitarCumple(String nombre, int edad) {
        System.out.println("Feliz cumpleaños " + nombre + " tienes " + edad + " años");
    }

    // RETORNO DE VALOR
    public static int sumar(int a, int b) {
        return a + b;
    }
    // SOBRECARGA DE METODOS
    public static int sumar(int a, int b, int c) {
        return a + b + c;
    }
    public static double sumar(double a, double b) {
        return a + b;
    }
}
