package Fundamentals.julio_23;

public class Variables {

    public static void main(String[] args) {

        System.out.println("Hola Mundo"); // Imprime Hola Mundo en la consola

        /* TIPOS DE VARIABLES */
        /* PRIMITIVOS */
        int numero = 10; // Variable de tipo entero
        double decimal = 10.5; // Variable de tipo decimal
        char caracter = 'a'; // Variable de tipo caracter
        boolean bandera = true; // Variable de tipo booleano

        /* NO PRIMITIVOS */
        Integer numero2 = 10; // Variable de tipo entero
        Double decimal2 = 10.5; // Variable de tipo decimal
        Character caracter2 = 'a'; // Variable de tipo caracter
        String cadena = "Hola Mundo"; // Variable de tipo cadena
        Boolean bandera2 = true; // Variable de tipo booleano

        /* ¿Cómo se declara una variable */
        // tipo nombreVariable = valorInicial;
        int numero3 = 10;
        // tipo nombreVariable;
        int numero4;
        // nombreVariable = valorInicial;
        numero4 = 10;

        /* CONDICIONALES */

        // if (condicion) { ... } else { ... }

        if (numero3 > 5) {
            System.out.println("El número es mayor a 5");
        } else if (numero2 < 12) {
            System.out.println("El número es menor a 12");
        } else {
            System.out.println("No sé cual es el numero pero no es mayor a 5 ni menor a 12");
        }

        /* OPERADORES */
        // + - * / % ++ -- // Suma, resta, multiplicación, división, módulo, incremento,
        // decremento
        // == != > < >= <= // Igual, diferente, mayor, menor, mayor o igual, menor o
        // igual
        // && || ! // AND OR NOT

        /* SWITCH */
        // switch (variable) { case valor: ... break; default: ... }
        String damage = "fluidos";
        switch (damage) {
            case "motor":
                System.out.println("Revise el cofre");
                break;
            case "llanta":
                System.out.println("Revise la llanta");
                break;
            case "puerta":
                System.out.println("Revise la puerta");
                break;
            case "electrico":
                System.out.println("Revise el sistema eléctrico");
                break;
            default: // Si no se cumple ningun caso
                System.out.println("No se que revisar");
                break;
        }

        /* STRINGS */
        String nombre = "Julio";
        String apellido = "Cesar";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);
        String nombreCompleto2 = nombre.concat(" ").concat(apellido);
        System.out.println(nombreCompleto2);
        System.out.println(nombreCompleto.charAt(4)); // Devuelve la letra en la posición 4
        System.out.println(nombreCompleto.length()); // Devuelve la longitud de la cadena


        /*  */
    }

}
