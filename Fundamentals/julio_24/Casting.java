package Fundamentals.julio_24;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Casting {

    public static void main(String[] args) {

        // Casting
        // Convertir un tipo de dato a otro
        int numFavorito = 14;
        double decimalFavorito = 3.9916;
        // Explicito
        numFavorito = (int) decimalFavorito;
        System.out.println("");
        System.out.println(numFavorito);
        // Implicito
        decimalFavorito = numFavorito;
        System.out.println(decimalFavorito);

        // Arreglos de datos
        // Declarar un arreglo
        int numFav1 = 7;
        int numFav2 = 14;
        int numFav3 = 21;
        int numFav4 = 28;
        int numFav5 = 35;
        int numFav6 = 42;
        int numFav7 = 49;
        // Declarar un arreglo con valores iniciales
        int[] numerosFavoritos = { 7, 14, 21, 28, 35, 42, 49 };

        // Declarar un arreglo con tamaño definido sin valores iniciales
        double[] decimalesFavoritos = new double[7];

        System.out.println(numerosFavoritos[3]);
        System.out.println(decimalesFavoritos[4]);
        decimalesFavoritos[4] = 3.1416;
        System.out.println(decimalesFavoritos[4]);
        System.out.println(decimalesFavoritos.length);

        Integer[] numerosFavoritos2 = { 7, 14, 21, 28, 35, 42, 49 };
        String[] palabrasFavoritas = { "Hola", "Mundo", "Java", "Casting", "Arreglos", "Datos" };

        /* ARRAYLIST */
        // Declarar un ArrayList
        ArrayList<Integer> numerosFavoritos3 = new ArrayList<Integer>();
        System.out.println(numerosFavoritos3.size());
        numerosFavoritos3.add(7);
        numerosFavoritos3.add(14);
        numerosFavoritos3.add(21);
        System.out.println(numerosFavoritos3.size());
        System.out.println(numerosFavoritos3);

        ArrayList<String> palabrasFavoritas2 = new ArrayList<String>();
        palabrasFavoritas2.add("Hola");
        palabrasFavoritas2.add("Mundo");
        palabrasFavoritas2.add("Java");
        System.out.println(palabrasFavoritas2.size());
        System.out.println(palabrasFavoritas2);
        palabrasFavoritas2.remove(1);
        System.out.println(palabrasFavoritas2);
        System.out.println(palabrasFavoritas2.get(0));
        palabrasFavoritas2.add(1, "Mundo");
        System.out.println(palabrasFavoritas2);

        ArrayList<Object> lista = new ArrayList<Object>();
        lista.add(7);
        lista.add("Hola");
        lista.add(3.1416);
        lista.add(true);
        System.out.println(lista);

        /* BUCLES */

        /* BÁSICOS */
        // For
        // for (inicializacion; condicion; incremento)
        // ACCIONES REPETITIVAS QUE SE REALIZAN UN NUMERO DE VECES DETERMINADO
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // While
        // ACCIONES REPETITIVAS QUE SE REALIZAN MIENTRAS SE CUMPLA UNA CONDICION
        int j = 0;
        System.out.println("While");
        while (j != 5) {
            j = (int) (Math.random() * 10);
            System.out.println(j);
        }
        // Do-While
        // ACCIONES REPETITIVAS QUE SE REALIZAN AL MENOS UNA VEZ Y DESPUES MIENTRAS SE
        // CUMPLA UNA CONDICION
        int k = 5;
        System.out.println("Do-While");
        do {
            k = (int) (Math.random() * 10);
            System.out.println(k);
        } while (k != 5);

        // For con arreglos para iterar
        for (int i = 0; i < numerosFavoritos.length; i++) {
            System.out.println(numerosFavoritos[i]);
        }

        /* AVANZADOS */
        // For each
        // for (tipo variable: coleccion)
        // ACCIONES REPETITIVAS QUE SE REALIZAN PARA CADA ELEMENTO DE UNA COLECCION
        System.out.println("For each");
        for (int num : numerosFavoritos) {
            System.out.println(num);
        }
        for (String palabra : palabrasFavoritas) {
            System.out.println(palabra);
        }
        for (Object elemento : lista) {
            System.out.println(elemento);
        }

        /* HASHMAPS */
        // Declarar un HashMap
        // HashMap<tipoClave, tipoValor> nombre = new HashMap<tipoClave, tipoValor>();

        HashMap<String, String> animalesFavoritos = new HashMap<String, String>();
        animalesFavoritos.put("roedor", "Chinchilla");
        animalesFavoritos.put("felino", "Gato Mainecoon");
        animalesFavoritos.put("canino", "Perro Husky");
        animalesFavoritos.put("aves", "Perico Australiano");
        animalesFavoritos.put("camelidos", "Alpaca");
        System.out.println(animalesFavoritos);
        System.out.println(animalesFavoritos.get("roedor"));

        HashMap<String, Object> contacto = new HashMap<String, Object>();
        contacto.put("nombre", "Julio");
        contacto.put("apellido", "Jaramillo");
        contacto.put("edad", 34);
        contacto.put("nacionalidad", "Ecuatoriana");
        contacto.put("parentesco", "padrino");
        contacto.put("estatura", 1.75);
        contacto.put("edad", 42);
        System.out.println(contacto);

        // Iterar un HashMap
        System.out.println("Iterar un HashMap");
        System.out.println(contacto.keySet());
        for (String clave : contacto.keySet()) {
            System.out.println(clave + ": " + contacto.get(clave));
        }

        // remover elementos
        contacto.remove("parentesco");
        System.out.println(contacto);

        System.out.println(contacto.get("peso"));

        // Excepciones
        // Errores que se presentan en tiempo de ejecución
        int a = 14;
        int b = 0;
        int [] arreglo = {1,2,3,4,5};
        try {
            System.out.println(arreglo[5]);
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("No se pudo hacer el proceso");
            System.out.println(e.getClass());
        }

        System.out.println("El programa sigue");

    }

}
