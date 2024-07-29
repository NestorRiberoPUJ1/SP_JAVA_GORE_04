package POO.julio_29;

public abstract class Oviparos {

    /* ATRIBUTO ESTÁTICO */
    static int contadorOviparos = 0;


    /* METODOS ABSTRACTOS */
    /* DEBEN SER IMPLEMENTADOS POR QUIEN LO HEREDA */
    abstract void alimentarse();

    abstract void moverse();

    /* METODOS DEFINIDOS PUEDEN SER SOBREESCRITOS */
    void hacerNido() {
        System.out.println("Haciendo nido...");
    }

    /* METODOS FINALES NO PUEDEN SER SOBREESCRITOS */
    final void eclosionar() {
        System.out.println("Eclosionando de un huevo...");
    }

    /* METODO ESTÁTICO */
    static void contarOviparos() {
        System.out.println("Hay " + contadorOviparos + " oviparos");
    }
}
