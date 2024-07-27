package POO.julio_26;

public class ObrasDeArteTest {

    public static void main(String[] args) {
        System.out.println("");
        ObrasDeArte david = new ObrasDeArte("David", "Miguel Ángel", "Mármol");
        ObrasDeArte monaLisa = new ObrasDeArte("Mona Lisa", "Leonardo Da Vinci", "Óleo");
        ObrasDeArte laNocheEstrellada = new ObrasDeArte();
        laNocheEstrellada.setTitulo("La noche estrellada");
        laNocheEstrellada.setAutor("Vincent Van Gogh");
        laNocheEstrellada.setMedio("Óleo");
        ObrasDeArte pulgarcito = new ObrasDeArte("Pulgarcito", null, "Cuento");

        System.out.println(ObrasDeArte.getContadorObrasDeArte());
        System.out.println(ObrasDeArte.getGaleria());
        System.out.println(ObrasDeArte.getGaleria().get(0).getTitulo());
        System.out.println(pulgarcito.getAutor());

        Literatura donQuijote = new Literatura("Don Quijote de la Mancha", "Miguel de Cervantes", "Novela", "Español",
                "Novela de caballería");
        System.out.println(donQuijote.getTitulo());

        david.exponer();
        donQuijote.exponer();

        david.restaurar();
        donQuijote.restaurar();

        ObrasDeArte.saludarArtistas();
        Literatura.saludarArtistas();


    }
}
