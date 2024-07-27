package POO.julio_26;


public class Literatura  extends ObrasDeArte{


    /* ATRIBUTOS */
    private String idioma;
    private String genero;
    
    /* CONSTRUCTORES */
    public Literatura() {
        super();
    }

    public Literatura(String titulo, String autor, String medio, String idioma, String genero) {
        super(titulo, autor, medio);
        this.idioma = idioma;
        this.genero = genero;
    }

    /* GETTERS Y SETTERS */
    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public void exponer() {
        System.out.println("La literatura " + this.getTitulo() + " es una obra de arte que se expone en una biblioteca.");
    }


    @Override
    public void restaurar(){
        super.restaurar();
        System.out.println("...Y ya se encuentra lista para leer.");
    }
    
    @Deprecated
    public static void saludarArtistas(){
        System.out.println("¡Hola artistas literarios!");
    }   
    
    
}

