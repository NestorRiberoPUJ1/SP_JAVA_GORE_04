package POO.julio_26;

import java.util.ArrayList;

public class ObrasDeArte {

    private static final String AUTOR_DEFAULT = "Desconocido";

    /* ATRIBUTOS DE CLASE */
    private static int contadorObrasDeArte = 0;
    private static ArrayList<ObrasDeArte> galeria = new ArrayList<>();

    /* ATRIBUTOS DE INSTANCIA */
    private String titulo;
    private String autor;
    private String medio;

    /* CONSTRUCTORES */
    public ObrasDeArte() {
        this.autor = AUTOR_DEFAULT;
        contadorObrasDeArte++;
        galeria.add(this);
    }

    public ObrasDeArte(String titulo, String autor, String medio) {
        this.titulo = titulo;
        if(autor == null) {
            this.autor = AUTOR_DEFAULT;
        } else {
            this.autor = autor;
        }
        this.medio = medio;

        contadorObrasDeArte++;
        galeria.add(this);
    }

    /* GETTERS Y SETTERS */
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor == null) {
            this.autor = AUTOR_DEFAULT;
        } else {
            this.autor = autor;
        }
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    /* GETTERS DE CLASE */
    public static int getContadorObrasDeArte() {
        return contadorObrasDeArte;
    }

    public static ArrayList<ObrasDeArte> getGaleria() {
        return galeria;
    }


    public void exponer(){
        System.out.println("La obra de arte " + this.titulo + " de " + this.autor + " se encuentra en exposición.");
    }

    public void restaurar(){
        System.out.println("La obra de arte " + this.titulo + " de " + this.autor + " ha sido restaurada.");
    }

    public static void saludarArtistas(){
        System.out.println("¡Hola artistas!");
    }
    
}
